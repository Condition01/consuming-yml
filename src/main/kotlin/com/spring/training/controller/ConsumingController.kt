package com.spring.training.controller

import com.spring.training.service.ConsumingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping(value = ["/consume"])
class ConsumingController(private val consumingService: ConsumingService) {
    @GetMapping(value = ["/nome"])
    fun getNome1() : String = consumingService.nome

    @GetMapping(value = ["/nome2"])
    fun getNome2() : String = consumingService.nome2

    @GetMapping(value = ["/nome3"])
    fun getNome3() : String = consumingService.nome3

    @GetMapping(value = ["/idade"])
    fun getIdade1() : Int = consumingService.idade

    @GetMapping(value = ["/idade2"])
    fun getIdade2() : Float = consumingService.idade2

    @GetMapping(value = ["/idade3"])
    fun getIdade3() : String = consumingService.idade3

    @GetMapping(value = ["/peso"])
    fun getPeso() : Float = consumingService.peso

    @GetMapping(value = ["/poder"])
    fun getPoder() : Double = consumingService.poder

    @GetMapping(value = ["/value"])
    fun getValue() : String? = consumingService.value

    @GetMapping(value = ["/cuteMusica"])
    fun getCurteMusica() : Boolean = consumingService.curteMusica

    @GetMapping(value = ["/dataNasc"])
    fun getDataNasc() : LocalDateTime = LocalDateTime.parse(consumingService.dataNascimento.replace(oldChar = ' ', newChar = 'T'))

    @GetMapping(value = ["/testDate"])
    fun getDate() : LocalDateTime = LocalDateTime.now()

    @GetMapping(value = ["/getFilhos"])
    fun getFilhos() : List<String> = consumingService.fConfig.filhos

    @GetMapping(value = ["/getFilmesFavoritos"])
    fun getFilmesFavoritos() : List<String> = consumingService.fConfig.filmesFavoritos

    @GetMapping(value = ["/getAmigos"])
    fun getAmigos(): List<Map<String,String>> = consumingService.fConfig.amigos

    @GetMapping(value = ["/getAmigosDebug"])
    fun getAmigosDebug(): List<Amigo> {
        val mapAmigos = consumingService.fConfig.amigos
        val listAmigos = mapAmigos.map {
            Amigo(it.get("name")!!, it.get("idade")!!.toInt(), it.get("tatoo")!!.toBoolean()
            ) }
        return listAmigos
    }

    @GetMapping(value = ["/getDescricao"]) //it will print all the text in one line because of the yml config
    fun getDescricao(): String = consumingService.descricao

    @GetMapping(value = ["/getSignature"]) //it will print respecting the line jumps and spaces in the yml file
    fun getSignature(): String = consumingService.signature

//    @GetMapping(value = ["/getFoo"])
//    fun getFoo(): String = consumingService.fConfig.foo.toString()

    @GetMapping(value = ["/getBaseVar1"])
    fun getBaseVar1(): String = consumingService.baseVar1

    @GetMapping(value = ["/getFooVar1"]) //this value is duplicated from base.var1 value
    fun getFooVar1(): String = consumingService.baseFoo1

    data class Amigo(
            val name: String,
            val idade: Int,
            val tatoo: Boolean
    )
}