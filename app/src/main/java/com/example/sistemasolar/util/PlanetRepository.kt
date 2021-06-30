package com.example.sistemasolar.util

import com.example.sistemasolar.model.Planet
import com.example.sistemasolar.R

object PlanetRepository {
    fun getAll():List<Planet> {
        return listOf(
                Planet(R.drawable.mercury, "Mercúrio",
                        "O planeta mais próximo do Sol, que gasta somente " +
                        "oitenta e oito dias para completar seu período de translação, possui uma " +
                        "aparência acinzentada com inúmeras marcas de impactos que lembram a superfície " +
                        "lunar. Na topografia de Mercúrio, destacam-se as áreas planas, as crateras de " +
                        "impacto e as cadeias montanhosas sinuosas, formadas pela contração da crosta " +
                        "durante o período de resfriamento do planeta."
                ),
                Planet(R.drawable.venus, "Vênus",
                        "O segundo planeta a partir do Sol possui tamanho, composição e massa " +
                                "similares à Terra. Contudo, o seu período de rotação é de 243 dias, " +
                                "superior ao tempo que Vênus leva a completar uma órbita ao redor do Sol, " +
                                "pelo que um dia venusiano é mais longo que um ano venusiano. Apesar " +
                                "de o núcleo ferroso de Vênus ser similar ao da Terra, a rotação " +
                                "extremamente lenta de Vênus não permite a existência de um campo magnético. " +
                                "A atmosfera venusiana, extraordinariamente espessa e violenta, " +
                                "é composta primariamente por dióxido de carbono e vapores de ácido sulfúrico " +
                                "na forma de nuvens permanentes que envolvem todo o planeta. " +
                                "Como consequência, além de uma intensa pressão atmosférica " +
                                "(noventa vezes superior à pressão atmosférica terrestre), ocorre um " +
                                "superefeito estufa que faz com que a temperatura na superfície atinja " +
                                "mais de 470 graus Celsius."),
                Planet(R.drawable.earth, "Terra",
                        "O maior planeta telúrico e o quinto maior do Sistema Solar, é o " +
                                "terceiro a contar do Sol. Seu núcleo é constituído principalmente " +
                                "por ferro, ao redor do qual encontra-se uma camada de rochas fundidas, " +
                                "por sua vez cercada por uma crosta relativamente fina e dividida em " +
                                "placas tectônicas em constante movimento, responsáveis pelas atividades " +
                                "sísmica e vulcânica na Terra. O núcleo metálico e a rotação do planeta" +
                                " permitem a formação de um substancial campo magnético. Com mais de " +
                                "setenta por cento de sua superfície coberta por água, a Terra apresenta " +
                                "uma peculiaridade em relação aos demais planetas, já que é o único " +
                                "conhecido a abrigar vida."),
                Planet(R.drawable.mars,"Marte",
                        "O planeta telúrico mais afastado do Sol passou a ser um mundo intrigante" +
                                " a partir do advento das observações telescópicas. Exibindo calotas " +
                                "polares variáveis e características superficiais mutantes, levantava " +
                                "suspeitas da possível existência de vida fora da Terra. Contudo, após " +
                                "o envio de sondas e exploradores robóticos, descobriu-se que Marte " +
                                "é um planeta desértico e não se constatou a existência de seres vivos. " +
                                "Entretanto, a sonda Mars Reconnaissance Orbiter revelou veios de água " +
                                "salgada que fluem em regiões montanhosas nos meses mais quentes do planeta, " +
                                "aumentando a possibilidade da existência de vida micro-orgânica. " +
                                "Com metade do tamanho da Terra, apresenta acidentes geográficos notáveis, " +
                                "como o Monte Olimpo, o maior vulcão extinto do Sistema Solar, com altitude " +
                                "três vezes maior do que a do Monte Everest, e o Valles Marineris, um " +
                                "sistema de cânions que se estende por mais de três mil quilômetros " +
                                "na região equatorial."),
                Planet(R.drawable.jupiter, "Júpiter",
                        "O maior e mais massivo planeta do Sistema Solar " +
                        "exibe peculiares faixas multicoloridas criadas por fortíssimos ventos que percorrem " +
                        "faixas longitudinais na parte superior de sua atmosfera. Frequentemente surgem " +
                        "nessas bandas vórtices e sistemas de tempestades circulares, como a Grande Mancha " +
                        "Vermelha, uma tormenta maior que a Terra que já dura por séculos. Dentre os " +
                        "gases que compõem sua atmosfera, hidrogênio e hélio são os mais abundantes, " +
                        "seguidos por pequenas frações de vapor d'água, metano e amônia."),
                Planet(R.drawable.saturn,"Saturno",
                        "O segundo maior planeta do Sistema Solar possui uma composição semelhante " +
                                "à de Júpiter, rica em hidrogênio e hélio. Sua atmosfera, em função " +
                                "do calor irradiado do interior de Saturno, apresenta-se em constante " +
                                "turbulência, com ventos de mais de 1 800 quilômetros por hora que criam " +
                                "bandas visíveis nas suas camadas superiores em tons de amarelo e dourado." +
                                " Embora mais fraco que o de Júpiter, o campo magnético do planeta ainda " +
                                "é quinhentas vezes mais intenso que o terrestre. Contudo, a característica " +
                                "mais notável de Saturno é seu impressionante sistema de anéis, formado " +
                                "essencialmente por fragmentos de gelo que se espalham por faixas, com " +
                                "milhares de quilômetros de extensão e paralelo ao equador do planeta"),
                Planet(R.drawable.uranus, "Urano",
                        "O sétimo planeta a partir do Sol foi o primeiro a ser descoberto " +
                                "com o auxílio de um telescópio em 1781. À semelhança de Vênus, o sentido " +
                                "de rotação de Urano é retrógrado relativamente ao da maioria dos corpos " +
                                "do Sistema Solar. Além disso, seu eixo de rotação é extremamente inclinado, " +
                                "fazendo com que cada um dos polos do planeta fique diretamente voltado " +
                                "para o Sol durante um longo período."),
                Planet(R.drawable.neptune,"Netuno",
                        "O gigante e gelado Netuno é o planeta mais afastado " +
                        "do Sol e foi o primeiro a ser localizado a partir de cálculos matemáticos em " +
                        "vez de observações regulares do céu. Sua busca foi motivada por se terem constatado " +
                        "irregularidades na órbita de Urano que só poderiam ser explicadas pela interação " +
                        "com um corpo de massa considerável ainda desconhecido. Observações subsequentes " +
                        "da área onde Netuno se deveria encontrar, segundo os resultados calculados, " +
                        "vieram comprovar a sua existência. A extremamente violenta atmosfera netuniana, " +
                        "com ventos cuja velocidade máxima de 1 200 km/h excede nove vezes a dos mais intensos " +
                        "que ocorrem na Terra, apresenta relevante porcentagem de metano, responsável por sua coloração azulada."),
                Planet(R.drawable.ceres, "Ceres",
                        "O menor planeta anão e também o mais próximo do Sol, Ceres, situa-se " +
                                "entre as órbitas de Marte e Júpiter, numa região povoada por inúmeros " +
                                "corpos menores denominada Cinturão de Asteroides. Com um formato aproximadamente " +
                                "esférico, Ceres é visto como um planeta embrionário que não atingiu porte " +
                                "suficiente devido provavelmente à influência gravitacional de Júpiter. " +
                                "Possivelmente abriga consideráveis quantidades de água sob a forma de " +
                                "gelo, num manto que envolve seu núcleo denso e rochoso."),
                Planet(R.drawable.pluto, "Plutão",
                        "Com aproximadamente dois terços do diâmetro da Lua, pensa-se " +
                                "atualmente que Plutão seja formado por um núcleo rochoso cercado por " +
                                "uma espessa camada de gelo. Sua órbita excêntrica faz com que, durante " +
                                "um período de vinte anos, o planeta anão fique mais próximo do Sol que " +
                                "Netuno, sendo então possível a formação de uma tênue e temporária atmosfera " +
                                "resultante da vaporização de compostos anteriormente em estado sólido."),
                Planet(R.drawable.eris,"Éris",
                        "Éris possui dimensões ligeiramente menores que as de Plutão e " +
                                "provavelmente a mesma composição. Originalmente apelidado de Xena, " +
                                "o planeta anão leva mais de quinhentos anos para completar seu período " +
                                "de translação e tem uma pequena lua, Disnomia."),
                Planet(R.drawable.makemake, "Makemake",
                        " Makemake, menor que Éris, contém metano e etano em sua superfície, " +
                                "além de uma coloração avermelhada atribuída à interação desses compostos " +
                                "com a radiação ultravioleta do Sol."),
                Planet(R.drawable.haumea, "Haumea",
                        " Haumea, um planeta anão de tamanho semelhante ao de " +
                                "Plutão, possui um dos mais curtos períodos de rotação do Sistema Solar " +
                                "(menos de quatro horas), o que provocou um alongamento do seu formato, " +
                                "dando-lhe uma aparência similar a uma bola de futebol americano; possui " +
                                "dois satélites naturais, Namaka e Hi'iaka.")

        )
    }
}