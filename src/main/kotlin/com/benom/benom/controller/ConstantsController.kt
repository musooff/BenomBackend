package com.benom.benom.controller

import com.benom.benom.model.contstants.City
import com.benom.benom.model.contstants.Province
import com.benom.benom.repository.CityRepository
import com.benom.benom.repository.ProvinceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/constants")
class ConstantsController {

    @Autowired
    private lateinit var provinceRepository: ProvinceRepository


    @Autowired
    private lateinit var cityRepository: CityRepository

    @GetMapping("/province/all")
    fun getProvinces(): List<Province> {
        return provinceRepository.findAll()
    }

    @PostMapping("/province")
    fun createProvince(@RequestBody province: Province) {
        provinceRepository.save(province)
    }

    private val sughd = "Шаҳри Хуҷанд\n" +
            "Шаҳри Истаравшан\n" +
            "Шаҳри Исфара\n" +
            "Шаҳри Гулистон\n" +
            "Шаҳри Конибодом\n" +
            "Шаҳри Панҷакент\n" +
            "Шаҳри Истиқлол\n" +
            "Шаҳри Бӯстон\n" +
            "Шаҳри Конибодом\n" +
            "Шаҳри Исфара\n" +
            "Ноҳияи Айнӣ\n" +
            "Ноҳияи Ашт\n" +
            "Ноҳияи Бобоҷон Ғафуров\n" +
            "Ноҳияи Ғончӣ\n" +
            "Ноҳияи Зафаробод\n" +
            "Ноҳияи Истаравшан\n" +
            "Ноҳияи Исфара\n" +
            "Ноҳияи Конибодом\n" +
            "Ноҳияи Кӯҳистони Мастчоҳ\n" +
            "Ноҳияи Мастчоҳ\n" +
            "Ноҳияи Панҷакент\n" +
            "Ноҳияи Расулов\n" +
            "Ноҳияи Спитаман\n" +
            "Ноҳияи Шаҳристон"

    private val pamir = "Шаҳри Хоруғ\n" +
            "Ноҳияи Дарвоз\n" +
            "Ноҳияи Ванҷ\n" +
            "Ноҳияи Рӯшон\n" +
            "Ноҳияи Ишкошим\n" +
            "Ноҳияи Мурғоб\n" +
            "Ноҳияи Роштқалъа\n" +
            "Ноҳияи Шуғнон\n"

    private val khatlon = "Шаҳри Бохтар\n" +
            "Шаҳри Кӯлоб\n" +
            "Шаҳри Норак\n" +
            "Шаҳри Леваканд (Сарбанд)\n" +
            "Ноҳияи Балҷувон\n" +
            "Ноҳияи Кушониён(Бохтар)\n" +
            "Ноҳияи Вахш\n" +
            "Ноҳияи Восеъ\n" +
            "Ноҳияи Данғара\n" +
            "Ноҳияи Ҷалолиддини Балхӣ\n" +
            "Ноҳияи Қубодиён\n" +
            "Ноҳияи Абдураҳмони Ҷомӣ\n" +
            "Ноҳияи Ҷайҳун\n" +
            "Ноҳияи Ҳамадонӣ\n" +
            "Ноҳияи Мӯминобод\n" +
            "Ноҳияи Носири Хусрав\n" +
            "Ноҳияи Панҷ\n" +
            "Ноҳияи Темурмалик\n" +
            "Ноҳияи Фархор\n" +
            "Ноҳияи Ховалинг\n" +
            "Ноҳияи Хуросон\n" +
            "Ноҳияи Дӯстӣ\n" +
            "Ноҳияи Шаҳртуз\n" +
            "Ноҳияи Шӯробод\n" +
            "Ноҳияи Ёвон"

    private val ntm = "Шаҳри Ваҳдат\n" +
            "Шаҳри Турсунзода\n" +
            "Шаҳри Ғарм\n" +
            "Шаҳри Ҳисор\n" +
            "Ноҳияи Варзоб\n" +
            "Ноҳияи Ваҳдат\n" +
            "Ноҳияи Дарбанд\n" +
            "Ноҳияи Рашт\n" +
            "Ноҳияи Рӯдакӣ\n" +
            "Ноҳияи Роғун\n" +
            "Ноҳияи Сангвор\n" +
            "Ноҳияи Тоҷикобод\n" +
            "Ноҳияи Турсунзода\n" +
            "Ноҳияи Файзобод\n" +
            "Ноҳияи Ҳисор\n" +
            "Ноҳияи Лахш\n" +
            "Ноҳияи Шаҳринав"

    private val dushanbe = "Исмоили Сомонӣ\nСино\nШоҳмансур\nФирдавсӣ"

    @GetMapping("/generation")
    fun generate() {
        val sughdCities = sughd.split("\n")
            .map { City(name = it) }
        val khatlonCities = khatlon.split("\n")
            .map { City(name = it) }
        val pamirCities = pamir.split("\n")
            .map { City(name = it) }
        val nbtCities = ntm.split("\n")
            .map { City(name = it) }
        val dushanbeCities = dushanbe.split("\n")
            .map { City(name = it) }


        val sughd = Province(
            name = "Вилояти Суғд",
            cities = sughdCities
        )

        val khatlon = Province(
            name = "Вилояти Хатлон",
            cities = khatlonCities
        )


        val pamir = Province(
            name = "Вилояти Мухтори Кӯҳистони Бадахшон",
            cities = pamirCities
        )


        val ntm = Province(
            name = "Ноҳияҳои тобеъи ҷумҳурӣ",
            cities = nbtCities
        )

        val dushanbe = Province(
            name = "Душанбе",
            cities = dushanbeCities
        )



        provinceRepository.save(sughd)
        provinceRepository.save(khatlon)
        provinceRepository.save(pamir)
        provinceRepository.save(ntm)
        provinceRepository.save(dushanbe)
    }


    @GetMapping("/cities/all")
    fun getCities(): List<City> {
        return cityRepository.findAll()
    }

}