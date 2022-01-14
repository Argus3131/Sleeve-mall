package com.sleeve.swg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Argus
 * @className SwaggerConfig
 * @description: TODO
 * @date 2022/1/13 14:12
 * @Version V1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    /**
     * 创建API应用
     * appinfo()增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例，用来控制那些接口暴露给Swagger来展现
     * 本例采用置顶扫描的包路径来定义指定要建立API的目录
     *
     * @return
     */
    @Bean
    public Docket createRestApi(Environment env) {
        //设置环境为dev
        Profiles dev = Profiles.of("dev");
        boolean flag = env.acceptsProfiles(dev);
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(flag)
                .groupName("Sleeve")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sleeve.swg.controller"))
                // 设置路径筛选 开启swagger
                .paths(PathSelectors.any()).build();
        return docket;
    }


    /**
     * 创建改API的基本信息（这些基本信息会展示在文档页面中）
     * 访问地址： http://项目实际地址/swagger-ui.html
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 设置页面标题
                .title("Sleeve-Mall后端api接口文档")
                .description("Api Documentation")
                .version("version 1.0")
                .termsOfServiceUrl("http://127.0.0.1:8088")
                .description("欢迎访问接口文档")
                // 定义版本号
                .version("1.0").build();
    }
}