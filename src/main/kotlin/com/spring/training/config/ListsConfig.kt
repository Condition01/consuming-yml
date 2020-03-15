package com.spring.training.config

import org.omg.CORBA.Object
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(value = "pessoa")
class ListsConfig(
        val filhos: List<String>,
        val filmesFavoritos: List<String>,
        val amigos: List<Map<String, String>>
//        val foo: () -> String = {
//            var var1 : String = ""
//             var1
//        }
)