package com.spring.training.service

import com.spring.training.config.ListsConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class ConsumingService (@Autowired val fConfig: ListsConfig){
    @Value("\${pessoa.nome}")
    lateinit var nome: String
    @Value("\${pessoa.nome2}")
    lateinit var nome2: String
    @Value("\${pessoa.nome3}")
    lateinit var nome3: String
    @Value("\${pessoa.idade}")
    val idade : Int = 0
    @Value("\${pessoa.idade2}")
    val idade2 : Float = 0.0F
    @Value("\${pessoa.idade3}")
    lateinit var idade3 : String
    @Value("\${pessoa.peso}")
    val peso : Float = 0.0F
    @Value("\${pessoa.poder}")
    val poder : Double = 0.00
    @Value("\${pessoa.value}")
    val value : String? = ""
    @Value("\${pessoa.curteMusica}")
    val curteMusica : Boolean = false
    @Value("\${pessoa.dataNascimento}")
    lateinit var dataNascimento : String
    @Value("\${pessoa.descricao}")
    lateinit var descricao : String
    @Value("\${pessoa.signature}")
    lateinit var signature : String
    @Value("\${pessoa.base.var1}")
    lateinit var baseVar1 : String
    @Value("\${pessoa.foo.var1}")
    lateinit var baseFoo1 : String
}