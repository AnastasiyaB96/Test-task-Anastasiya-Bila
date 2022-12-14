package com.belaia.anastasia.testtaskukeess.data

import android.util.Log
import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.databind.ObjectMapper

object EventsRepository {
    fun getAllPeopleData(): List<PersonModel> {
        val rawData = sampleData
        val mapper = ObjectMapper(JsonFactory())
        val personArray = mapper.readValue(rawData, Array<PersonModel>::class.java)
        return personArray.toList()
    }

    private const val sampleData = "[" +
            "{" +
            "\"_id\": \"60c8a132f23a34c116457370\"," +
            "\"name\": \"Audrey Gross\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Dolore ullamco do cupidatat eiusmod esse pariatur. Labore voluptate in enim excepteur consectetur aliqua exercitation consectetur magna" +
            "elit. Ea aliqua esse irure laborum velit anim. Ex exercitation pariatur commodo excepteur. Laboris esse consectetur excepteur sit in.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2020/12/12/17/24/little-egret-5826070__480.jpg\"," +
            "\"birth\": {" +
            "\"date\": \"1979-12-04T03:56:55 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Trinidad and Tobago, Adelino\"," +
            "\"latitude\": -83.325165," +
            "\"longitude\": 172.333167" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a1328398946bdbdfda20\"," +
            "\"name\": \"Berger Hebert\"," +
            "\"gender\": \"male\"," +
            "\"about\": \"Minim culpa veniam amet cillum. Laboris sint dolor ullamco exercitation occaecat esse laboris voluptate voluptate ut sint veniam" +
            "reprehenderit. Commodo anim exercitation commodo in enim fugiat cillum enim officia id officia dolor. Commodo dolore do nulla quis voluptate" +
            "reprehenderit.\\r\"," +
            "\"picture\": \"\"," +
            "\"birth\": {" +
            "\"date\": \"1953-03-07T01:04:08 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Azerbaijan, Needmore\"," +
            "\"latitude\": 36.773748," +
            "\"longitude\": -36.690845" +
            "}," +
            "\"death\": {" +
            "\"date\": \"2010-08-04T12:03:25 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"Czech Republic, Lemoyne\"," +
            "\"latitude\": -80.25033," +
            "\"longitude\": -106.165028" +
            "}" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a132b1fa346cdea66b6b\"," +
            "\"name\": \"Audrey Gross\"," +
            "\"gender\": \"male\"," +
            "\"about\": \"Fugiat labore ex irure eiusmod magna laboris. Est laborum sint sunt consequat sit. Adipisicing ad proident duis est qui. In tempor sit enim est" +
            "nostrud laboris et exercitation laborum. Anim proident velit anim magna cupidatat dolore veniam anim ullamco. Minim occaecat non et mollit.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2017/12/25/22/52/tiger-3039280__480.jpg\"," +
            "\"birth\": {" +
            "\"date\": \"1978-09-28T05:35:49 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"Marshall Islands, Eureka\"," +
            "\"latitude\": -29.003949," +
            "\"longitude\": 37.738132" +
            "}" +
            "}," +
            "\"death\": {" +
            "\"date\": \"2016-03-09T08:29:33 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Paraguay, Marienthal\"," +
            "\"latitude\": 33.707175," +
            "\"longitude\": -85.545545" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a1326d15b79269a310b9\"," +
            "\"name\": \"Kelly Kinney\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Lorem qui dolore aliquip ut. Nulla eiusmod est id nulla consectetur pariatur mollit in consectetur et. Anim incididunt enim do exercitation" +
            "anim anim sunt esse nostrud. Culpa cillum adipisicing laboris labore amet aliquip commodo duis officia do. Labore esse adipisicing commodo cupidatat" +
            "eiusmod. Aliqua proident duis non anim sunt ipsum. Do esse anim et ad.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2016/04/26/07/57/woman-1353825__480.png\"," +
            "\"birth\": {" +
            "\"date\": \"1951-05-03T10:13:37 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"Norway, Soudan\"," +
            "\"latitude\": -55.231715," +
            "\"longitude\": -21.703151" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a13251a2abf71584e58b\"," +
            "\"name\": \"Ella Howard\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Aliqua consectetur voluptate aliquip duis consectetur. Amet nulla nisi elit aliquip quis nulla proident reprehenderit. Et deserunt quis aliqua" +
            "proident amet tempor eiusmod laboris elit enim aliquip. Minim sint dolor officia eiusmod est ad irure.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2016/02/07/19/44/cat-1185453__480.png\"," +
            "\"birth\": {" +
            "\"date\": \"1956-10-23T07:35:51 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"S. Georgia and S. Sandwich Isls., Chloride\"," +
            "\"latitude\": -37.882566," +
            "\"longitude\": -114.401054" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a132f72321a9a11c6cc3\"," +
            "\"name\": \"Hays Blackwell\"," +
            "\"gender\": \"male\"," +
            "\"about\": \"Consectetur pariatur laborum ad exercitation. Nisi laborum minim dolore anim sit labore labore elit consequat nostrud culpa consectetur." +
            "Consequat labore elit cupidatat velit do nisi officia. Nostrud commodo ullamco ipsum cillum aliquip elit deserunt irure reprehenderit pariatur cillum." +
            "Nulla enim id laborum sit sit enim cillum et ut ex velit.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2018/04/11/11/54/small-poly-3310319__480.jpg\"," +
            "\"birth\": {" +
            "\"date\": \"1983-12-12T11:03:28 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Jordan, Alfarata\"," +
            "\"latitude\": 60.155567," +
            "\"longitude\": -152.856448" +
            "}" +
            "}," +
            "\"death\": {" +
            "\"date\": \"2014-11-10T09:02:26 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Pakistan, Knowlton\"," +
            "\"latitude\": 21.964374," +
            "\"longitude\": 173.396518" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a13250c342ffc2d8472a\"," +
            "\"name\": \"Roberson Rosa\"," +
            "\"gender\": \"male\"," +
            "\"about\": \"Qui exercitation est sint nostrud fugiat. Aute quis nulla non nisi id quis nisi. Est consectetur dolore consequat esse dolor dolore dolor amet" +
            "aliquip magna. Culpa quis in aliquip dolor. Sint sit exercitation sint officia cupidatat eiusmod occaecat labore dolor do commodo magna. Laboris velit" +
            "mollit eiusmod in minim in duis cupidatat voluptate. Magna et fugiat sit cupidatat laboris nulla esse veniam eiusmod adipisicing commodo consequat" +
            "magna excepteur.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2017/06/01/07/31/elephant-2362696__340.png\"," +
            "\"birth\": {" +
            "\"date\": \"1956-03-05T09:07:19 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Falkland Islands (Malvinas), Kingstowne\"," +
            "\"latitude\": -11.900825," +
            "\"longitude\": -47.027844" +
            "}" +
            "}," +
            "\"death\": {" +
            "\"date\": \"2013-03-16T07:58:50 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Finland, Snowville\"," +
            "\"latitude\": -80.198416," +
            "\"longitude\": 125.666659" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a13299194fdb1b264a08\"," +
            "\"name\": \"Owens Santana\"," +
            "\"gender\": \"male\"," +
            "\"about\": \"Fugiat ea quis et ad. Tempor do mollit ex nostrud consequat sunt. Dolor ad sint voluptate ea dolore reprehenderit id. Est ullamco nulla" +
            "occaecat veniam cupidatat.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2018/08/28/12/41/avatar-3637425__480.png\"," +
            "\"birth\": {" +
            "\"date\": \"1967-12-09T06:31:48 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Puerto Rico, Leyner\"," +
            "\"latitude\": 64.283843," +
            "\"longitude\": -25.029966" +
            "}" +
            "}," +
            "\"death\": {" +
            "\"date\": \"2013-06-29T04:51:04 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"Venezuela, Franklin\"," +
            "\"latitude\": -29.91756," +
            "\"longitude\": 82.705012" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a132a3da9b8b4acd2275\"," +
            "\"name\": \"Vicky Burnett\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Consequat ex anim consequat adipisicing anim eu ullamco cupidatat. Ad cupidatat proident proident irure aute ipsum exercitation" +
            "consectetur eu amet proident quis. Cillum ex eiusmod labore ex reprehenderit tempor in dolor est do est exercitation consectetur. Amet officia culpa" +
            "nulla do irure ullamco. Ipsum deserunt aliqua magna ad reprehenderit non dolor ipsum ut nostrud.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2017/07/10/11/28/bulldog-2489829__480.jpg\"," +
            "\"birth\": {" +
            "\"date\": \"1974-11-23T02:04:08 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Ukraine, Lookingglass\"," +
            "\"latitude\": -33.62618," +
            "\"longitude\": 20.579892" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a132887177706ecc071d\"," +
            "\"name\": \"Elizabeth Valenzuela\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Exercitation ullamco dolore aute occaecat in fugiat in. Ex proident reprehenderit sint et minim aliqua sint pariatur ipsum excepteur cillum" +
            "eiusmod. Enim labore dolor ad aliqua velit pariatur duis mollit pariatur. Cillum aute cupidatat occaecat proident nostrud adipisicing et tempor est id" +
            "eiusmod ut. Lorem adipisicing quis magna ullamco consectetur consequat aliquip adipisicing ea culpa nostrud enim. Nostrud ad enim irure reprehenderit" +
            "do officia pariatur. Lorem est in aliquip enim.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2012/04/18/14/48/horse-37250__480.png\"," +
            "\"birth\": {" +
            "\"date\": \"1967-09-30T10:42:20 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"Albania, Mathews\"," +
            "\"latitude\": -14.390302," +
            "\"longitude\": 93.232221" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a132e128caeda8de6e07\"," +
            "\"name\": \"Pacheco Joyce\"," +
            "\"gender\": \"male\"," +
            "\"about\": \"Eiusmod est minim eiusmod cupidatat et ullamco. Aliquip cupidatat est esse deserunt pariatur elit. Dolor esse laborum non laborum qui" +
            "proident dolor amet est fugiat. Aliquip laborum aliqua adipisicing cupidatat.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2017/11/10/10/39/light-2935944__480.png\"," +
            "\"birth\": {" +
            "\"date\": \"1966-06-23T10:39:23 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"US Minor Outlying Islands, Roeville\"," +
            "\"latitude\": -12.863232," +
            "\"longitude\": -12.295563" +
            "}" +
            "}," +
            "\"death\": {" +
            "\"date\": \"2021-01-25T11:58:23 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Nauru, Clay\"," +
            "\"latitude\": -72.7041," +
            "\"longitude\": 140.932152" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a132d2dafd6566ddf9c8\"," +
            "\"name\": \"Reyna Webster\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Reprehenderit occaecat officia aliqua sit. Pariatur in ea aute cupidatat exercitation cillum irure magna minim. Excepteur aute reprehenderit" +
            "labore velit Lorem incididunt veniam irure reprehenderit velit. Quis deserunt aute culpa id sunt nulla esse tempor. Commodo voluptate do aliquip" +
            "commodo.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2017/08/26/16/03/parrot-2683452__480.png\"," +
            "\"birth\": {" +
            "\"date\": \"1980-03-04T03:44:15 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Chile, Templeton\"," +
            "\"latitude\": -6.032902," +
            "\"longitude\": -117.759961" +
            "}" +
            "}," +
            "\"death\": {" +
            "\"date\": \"2011-01-01T12:05:16 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Peru, Caroleen\"," +
            "\"latitude\": 38.194622," +
            "\"longitude\": 20.273554" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a1326a40a6f6b03dcb9c\"," +
            "\"name\": \"Bessie Walsh\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Labore reprehenderit consectetur do elit do est tempor consequat do voluptate fugiat. Aliquip tempor dolore enim quis nostrud laborum elit" +
            "magna est irure qui veniam anim. Eu voluptate duis Lorem officia ex cupidatat in. Lorem nulla aliqua occaecat in. Ea aute velit voluptate excepteur" +
            "occaecat tempor amet ea in ipsum deserunt adipisicing.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2018/11/25/03/47/ardea-herodias-3836783__480.jpg\"," +
            "\"birth\": {" +
            "\"date\": \"1987-07-30T08:05:26 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"Cocos (Keeling Islands), Gibbsville\"," +
            "\"latitude\": -65.284," +
            "\"longitude\": 101.154141" +
            "}" +
            "}," +
            "\"death\": {" +
            "\"date\": \"2018-09-25T10:54:07 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"San Marino, Canby\"," +
            "\"latitude\": 84.452724," +
            "\"longitude\": 4.954836" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a1325a08eae0e8577992\"," +
            "\"name\": \"Dolores Welch\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Minim ea sit ex commodo. Occaecat velit tempor nisi et aliquip duis labore officia. Irure dolore nostrud laboris do. Cupidatat voluptate ipsum" +
            "anim ut exercitation et esse ex. Eu nulla ex proident commodo ullamco sunt. Consequat fugiat ex voluptate quis. Cillum consequat adipisicing eu sit dolor" +
            "sunt.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2018/10/14/10/18/horse-3746116__480.jpg\"," +
            "\"birth\": {" +
            "\"date\": \"1950-12-23T01:26:07 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Bosnia and Herzegovina, Biehle\"," +
            "\"latitude\": -48.077485," +
            "\"longitude\": -2.454159" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a13273883634f6f87354\"," +
            "\"name\": \"Dorothy Ramos\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Reprehenderit eiusmod commodo in cillum enim esse est. Ut incididunt eu amet dolore voluptate cupidatat quis. Magna occaecat nulla" +
            "aliquip commodo cillum occaecat voluptate mollit incididunt. Dolor dolore dolore duis deserunt qui fugiat laboris irure adipisicing ad incididunt anim." +
            "Cupidatat labore aute mollit et amet sit sunt consectetur in enim nulla aliqua.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2022/04/19/07/54/man-7142125__480.png\"," +
            "\"birth\": {" +
            "\"date\": \"1967-09-27T11:21:22 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"France, Savage\"," +
            "\"latitude\": 43.765219," +
            "\"longitude\": -33.121845" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a1324a697d1f0957b66d\"," +
            "\"name\": \"Jennings Steele\"," +
            "\"gender\": \"male\"," +
            "\"about\": \"Fugiat aliqua incididunt ut Lorem eu eiusmod proident non sint quis ad commodo proident tempor. Consectetur elit sunt magna deserunt" +
            "sunt. Tempor eu aliqua sit enim nisi duis laboris deserunt laborum amet id ullamco dolor. Reprehenderit incididunt mollit eu voluptate cillum aliqua nisi" +
            "nostrud officia incididunt reprehenderit sint consectetur nostrud. Qui cillum deserunt mollit labore dolore aliquip in ipsum aliqua consectetur aliquip" +
            "occaecat ipsum amet.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2019/01/10/12/20/animal-3925260__480.jpg\"," +
            "\"birth\": {" +
            "\"date\": \"1970-04-16T07:49:40 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"Botswana, Magnolia\"," +
            "\"latitude\": 51.815309," +
            "\"longitude\": -19.135098" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a132a4de08320c824035\"," +
            "\"name\": \"Lynda Vasquez\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Sint occaecat exercitation aliqua laborum. Velit aliquip non laborum magna dolor mollit. Sit non dolore aute minim aliquip et id do sint. Et" +
            "adipisicing labore esse pariatur incididunt. Ullamco sit proident in tempor exercitation deserunt adipisicing.\\r\"," +
            "\"picture\": \"https://cdn.pixabay.com/photo/2016/03/31/19/58/avatar-1295430__480.png\"," +
            "\"birth\": {" +
            "\"date\": \"1984-03-11T10:06:07 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Christmas Island, Virgie\"," +
            "\"latitude\": 43.371439," +
            "\"longitude\": -104.895985" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a1326606b07fd18db221\"," +
            "\"name\": \"Danielle Perkins\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Exercitation aliquip magna in qui nisi velit magna aliqua ad aute aute in. Minim dolore ipsum fugiat aliqua et officia in sit eiusmod culpa ex" +
            "deserunt irure. Et aute eu deserunt irure tempor cupidatat voluptate laboris sint occaecat nostrud pariatur labore. Aliquip irure amet non id aliqua" +
            "aliquip dolore pariatur anim et dolore exercitation ea esse. Exercitation Lorem pariatur proident dolore eiusmod et dolore amet sit.\\r\"," +
            "\"picture\": \"http://www.rollingstonesnet.com/images/Faithfull_1966.jpg\"," +
            "\"birth\": {" +
            "\"date\": \"1985-07-13T06:09:09 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"South Africa, Staples\"," +
            "\"latitude\": -25.705984," +
            "\"longitude\": 169.939622" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a132defcb1ecc40a8806\"," +
            "\"name\": \"Tran Mack\"," +
            "\"gender\": \"male\"," +
            "\"about\": \"Dolor dolore duis sunt enim minim consectetur dolore id deserunt aute esse ut exercitation. Cillum sint incididunt irure proident ea. Fugiat" +
            "sunt elit anim dolor laborum. Exercitation laborum esse fugiat esse ullamco consectetur adipisicing in consequat cillum dolore enim elit. Quis eiusmod" +
            "enim aliqua qui eu in voluptate. Deserunt aute do veniam pariatur irure voluptate sint.\\r\"," +
            "\"picture\": \"\"," +
            "\"birth\": {" +
            "\"date\": \"1981-09-16T12:25:43 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"Norfolk Island, Hiwasse\"," +
            "\"latitude\": 17.899439," +
            "\"longitude\": -1.300644" +
            "}" +
            "}," +
            "\"death\": {" +
            "\"date\": \"2019-06-26T05:10:34 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"Hong Kong, Efland\"," +
            "\"latitude\": 25.422173," +
            "\"longitude\": -58.036587" +
            "}" +
            "}" +
            "}," +
            "{" +
            "\"_id\": \"60c8a1329bbd6244e40f5a17\"," +
            "\"name\": \"Jan Hobbs\"," +
            "\"gender\": \"female\"," +
            "\"about\": \"Labore consequat magna anim id occaecat eiusmod id adipisicing ea. Occaecat cillum incididunt nulla aliqua minim Lorem laborum duis ad" +
            "non. Ut laborum aliquip elit ea minim id tempor veniam excepteur pariatur laborum culpa duis. Ipsum commodo dolore veniam qui mollit labore sit sit" +
            "mollit nostrud dolor nulla esse Lorem. Ut eu velit mollit consequat qui officia ex consequat proident enim et adipisicing ea ad. Culpa mollit magna" +
            "occaecat nulla. Deserunt sit laborum ad proident magna id ut consectetur magna minim adipisicing eiusmod do.\\r\"," +
            "\"picture\": \"http://thepastisunwritten.files.wordpress.com/2010/12/pattieboyd1.jpg\"," +
            "\"birth\": {" +
            "\"date\": \"1956-03-01T03:19:37 -02:00\"," +
            "\"location\": {" +
            "\"name\": \"Viet Nam, Salix\"," +
            "\"latitude\": 11.701478," +
            "\"longitude\": 171.557488" +
            "}" +
            "}," +
            "\"death\": {" +
            "\"date\": \"2014-09-05T09:19:34 -03:00\"," +
            "\"location\": {" +
            "\"name\": \"Spain, Logan\"," +
            "\"latitude\": -20.186055," +
            "\"longitude\": -38.938807" +
            "}" +
            "}" +
            "}" +
            "]"
}