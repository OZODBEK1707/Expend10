package com.example.expend10

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expend10.databinding.ActivityMain2Binding
import com.example.expend10.models.MyDataBase

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra("lop")



        if (name== MyDataBase.map[MyDataBase.titleList[0]]?.get(0)){
            binding.tvView.text = "\"Just for fans\" – that's our belief. Our hardcore Mi fans lead every step of the way. In fact, many Xiaomi employees were first Mi fans before joining the team. As a team, we share the same relentless pursuit of perfection, constantly refining and enhancing our products to create the best user experience possible. We are also fearless in testing new ideas and pushing our own boundaries. Our dedication and belief in innovation, together with the support of Mi fans, are the driving forces behind our unique Mi products."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[0]]?.get(1)){
            binding.tvView.text = "Realme (stylized as realme) is a Chinese consumer electronics manufacturer based in Shenzhen, Guangdong. It was founded by Li Bingzhong (known as Sky Li) on May 4, 2018, who was former vice president of Oppo. Started originally as a sub-brand of Oppo, Realme eventually ventured as its own brand. Realme then became the fastest-growing 5G smartphone brand in Q3 2021 with an 831% growth rate."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[0]]?.get(2)){
            binding.tvView.text = "Samsung Galaxy (Korean: 삼성 갤럭시, stylised as SΛMSUNG Galaxy since 2015 (except Japan where it omits the Samsung branding),[2] previously stylised as Samsung GALAXY; abbreviated as SG) is a series of computing and mobile computing devices that are designed, manufactured and marketed by Samsung Electronics. The product line includes the Samsung Galaxy S series of high-end smartphones, the Samsung Galaxy Tab series of tablets, the Samsung Galaxy Note series of tablets and phablets with the added functionality of a stylus, the foldable Samsung Galaxy Z series, and smartwatches including the first version of the Samsung Galaxy Gear, with later versions dropping the Galaxy branding, until the release of the Samsung Galaxy Watch in 2018."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[0]]?.get(3)){
            binding.tvView.text = "THE BRAND. Infinix was founded 2013 with the commitment of building stylishly designed cutting-edge technology with a focus on smart devices built to deliver fantastic smartphone experiences. Infinix products are made from the ground up with next-level technology & exceptional design at the core of every creation."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[0]]?.get(4)){
            binding.tvView.text = "The brand name \"Oppo\" was registered in China in 2001 and launched in 2004.[1] Since then, the company has expanded to 50 countries.[1]\n" +
                    "\n" +
                    "In June 2016, OPPO became the largest smartphone manufacturer in China,[2] selling its phones at more than 200,000 retail outlets.[3] OPPO was the top smartphone brand in China in 2019 and was ranked No. 5, in market share, worldwide.[4]"
        }
        if (name== MyDataBase.map[MyDataBase.titleList[0]]?.get(5)){
            binding.tvView.text = "The iPhone is a line of smartphones designed and marketed by Apple Inc. These devices use Apple's iOS mobile operating system. The first-generation iPhone was announced by then-Apple CEO Steve Jobs on January 9, 2007. Since then, Apple has annually released new iPhone models and iOS updates. As of November 1, 2018, more than 2.2 billion iPhones had been sold. As of 2022, the iPhone accounts for 15.6% of global smartphone market share.[3]"
        }
        if (name== MyDataBase.map[MyDataBase.titleList[0]]?.get(6)){
            binding.tvView.text = "Honor (stylized and marketed as HONOR) is a smartphone brand majority owned by a state-owned enterprise controlled by the municipal government of Shenzhen. It was formerly owned by Huawei Technologies. Honor provides smartphone handsets primarily targeting young consumers but has also released tablet computers and wearable technology."
        }
        //computers
        if (name== MyDataBase.map[MyDataBase.titleList[1]]?.get(0)){
            binding.tvView.text = "The company, first named PC’s Limited, was founded in 1984 by American Michael Dell, who was then a student at the University of Texas in Austin. Initially running the business from a dormitory room, Dell started out providing customized upgrades for PCs. The venture proved profitable, and Dell dropped out of college that same year to begin building PCs."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[1]]?.get(1)){
            binding.tvView.text = "The Mac (known as Macintosh until 1999) is a family of personal computers designed and marketed by Apple Inc.. Macs are known for their ease of use[1] and distinctive aluminium, minimalist designs. They are popular among students, creative professionals, and software engineers. The current Mac lineup includes the MacBook Air and MacBook Pro laptops, as well as the iMac, Mac mini, Mac Studio and Mac Pro desktop computers. Mac computers run the macOS operating system."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[1]]?.get(2)){
            binding.tvView.text = "he Hewlett-Packard Company, commonly shortened to Hewlett-Packard (/ˈhjuːlɪt ˈpækərd/ HYEW-lit PAK-ərd) or HP, was an American multinational information technology company headquartered in Palo Alto, California. HP developed and provided a wide variety of hardware components, as well as software and related services to consumers, small and medium-sized businesses (SMBs), and large enterprises, including customers in the government, health, and education sectors. The company was founded in a one-car garage in Palo Alto by Bill Hewlett and David Packard in 1939, and initially produced a line of electronic test and measurement equipment. The HP Garage at 367 Addison Avenue is now designated an official California Historical Landmark, and is marked with a plaque calling it the \"Birthplace of 'Silicon Valley'\"."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[1]]?.get(3)){
            binding.tvView.text = "ASUSTek Computer Inc. (/ˈeɪsuːs/,[3] /eɪˈsuːs/,[4] /ɑːˈ-/,[5] /əˈ-/;[6] Chinese: 華碩電腦股份有限公司; pinyin: Huáshuò Diànnǎo Gǔfèn Yǒuxiàn Gōngsī; stylised as ASUSTeK or ASUS) is a Taiwanese[7] multinational computer and phone hardware and electronics company headquartered in Beitou District, Taipei, Taiwan. Its products include desktop computers, laptops, netbooks, mobile phones, networking equipment, monitors, wi-fi routers, projectors, motherboards, graphics cards, optical storage, multimedia products, peripherals, wearables, servers, workstations, and tablet PCs. The company is also an original equipment manufacturer (OEM)."
        }

        //computer accessories
        if (name== MyDataBase.map[MyDataBase.titleList[2]]?.get(0)){
            binding.tvView.text = "A USB flash drive (also called a thumb drive)[1][note 1] is a data storage device that includes flash memory with an integrated USB interface. It is typically removable, rewritable and much smaller than an optical disc. Most weigh less than 30 g (1 oz). Since first appearing on the market in late 2000, as with virtually all other computer memory devices, storage capacities have risen while prices have dropped. As of March 2016, flash drives with anywhere from 8 to 256 gigabytes (GB[4]) were frequently sold, while 512 GB and 1 terabyte (TB[5]) units were less frequent.[6][7] As of 2018, 2 TB flash drives were the largest available in terms of storage capacity.[8] Some allow up to 100,000 write/erase cycles, depending on the exact type of memory chip used, and are thought to physically last between 10 and 100 years under normal circumstances (shelf storage time[9])."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[2]]?.get(1)){
            binding.tvView.text = "A bag (also known regionally as a sack) is a common tool in the form of a non-rigid container. The use of bags predates recorded history, with the earliest bags being lengths of animal skin, cotton, or woven plant fibers, folded up at the edges and secured in that shape with strings of the same material.[1]"
        }
        if (name== MyDataBase.map[MyDataBase.titleList[2]]?.get(2)){
            binding.tvView.text = "A computer mouse (plural mice, sometimes mouses)[nb 1] is a hand-held pointing device that detects two-dimensional motion relative to a surface. This motion is typically translated into the motion of a pointer on a display, which allows a smooth control of the graphical user interface of a computer."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[2]]?.get(3)){
            binding.tvView.text = "A computer keyboard is a peripheral input device modeled after the typewriter keyboard[1] [2]which uses an arrangement of buttons or keys to act as mechanical levers or electronic switches. Replacing early punched cards and paper tape technology, interaction via teleprinter-style keyboards have been the main input method for computers since the 1970s, supplemented by the computer mouse since the 1980s."
        }


        if (name== MyDataBase.map[MyDataBase.titleList[3]]?.get(0)){
            binding.tvView.text = "JPMorgan Chase & Co (Russian J.P. Morgan Chase and Co.) is an American transnational financial conglomerate, one of the largest banks in the world[5], with its headquarters in New York, Manhattan. The Financial Stability Board (FSB) has recognized JPMorgan Chase & Co as the most important financial conglomerate in the world, and ranks first in the list of globally systemically important banks in the world.[6] As the largest investment bank in the world and the largest commercial bank in the US, it is one of the \"big four\" US banks, along with Bank of America, Citigroup and Wells Fargo"
        }
        if (name== MyDataBase.map[MyDataBase.titleList[3]]?.get(1)){
            binding.tvView.text = "Reading is the process of taking in the sense or meaning of letters, symbols, etc., especially by sight or touch.[1][2][3][4]\n" +
                    "\n" +
                    "For educators and researchers, reading is a multifaceted process involving such areas as word recognition, orthography (spelling), alphabetics, phonics, phonemic awareness, vocabulary, comprehension, fluency, and motivation.[5][6]"
        }
        if (name== MyDataBase.map[MyDataBase.titleList[3]]?.get(2)){
            binding.tvView.text = "In sociolinguistics, SPEAKING or the SPEAKING model, is a model socio-linguistic study (represented as a mnemonic) developed by Dell Hymes. Hymes developed this model as part of a new methodology referred to as the ethnography of speaking. This model is a tool to assist the identification and labeling of components of interactional linguistics that was driven by his view that, in order to speak a language correctly, one needs not only to learn its vocabulary and grammar, but also the context in which words are used. In essence, learning the components of the SPEAKING model is essential for linguistic competence."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[3]]?.get(3)){
            binding.tvView.text = "Writing is a medium of human communication which involves the representation of a language through a system of physically inscribed, mechanically transferred, or digitally represented symbols."
        }

        //TV brand
        if (name== MyDataBase.map[MyDataBase.titleList[4]]?.get(0)){
            binding.tvView.text = "LG Electronics Inc. (Korean LG전자) (pronounced Elji Jeonja) is a South Korean company, one of the world's largest manufacturers of consumer electronics and home appliances. Part of the conglomerate LG Group. The main office of LG Electronics is located in Seoul, Republic of Korea, 120 representative offices of the company are open in 95 countries of the world. As of 2010, the company's employees were 90,578 people[2]. The total turnover of the company as of 2010 amounted to 48.2 billion dollars[2]."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[4]]?.get(1)){
            binding.tvView.text = "Artel (Russian Artel [source not specified 743 days]) is an Uzbek group of companies, part of the largest private holding in Uzbekistan AKFA Group, a manufacturer of household appliances and electronics [1]. The company was founded in 2011 following the decision to launch industrial sectors for the production of home appliances under its own brand. In the same year, an agreement was signed with the South Korean company Samsung, with the Italian industrialist Gloria and the Chinese company Midea [2]. Artel is part of the joint-stock company Uzeltekhsanoat. The Artel company includes a couple of dozen joint ventures[3]."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[4]]?.get(2)){
            binding.tvView.text = "Samsung Galaxy (Korean: 삼성 갤럭시, stylised as SΛMSUNG Galaxy since 2015 (except Japan where it omits the Samsung branding),[2] previously stylised as Samsung GALAXY; abbreviated as SG) is a series of computing and mobile computing devices that are designed, manufactured and marketed by Samsung Electronics. The product line includes the Samsung Galaxy S series of high-end smartphones, the Samsung Galaxy Tab series of tablets, the Samsung Galaxy Note series of tablets and phablets with the added functionality of a stylus, the foldable Samsung Galaxy Z series, and smartwatches including the first version of the Samsung Galaxy Gear, with later versions dropping the Galaxy branding, until the release of the Samsung Galaxy Watch in 2018."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[4]]?.get(3)){
            binding.tvView.text = "Smart TV (translated from English - \"smart TV\") is a traditional TV with integrated Internet and interactive features that allow users to receive music and videos, view websites and photos. Smart TVs are a technological fusion of computers, TVs and digital media players[1][2]."
        }
        //kitchen appliances
        if (name== MyDataBase.map[MyDataBase.titleList[5]]?.get(0)){
            binding.tvView.text = "A kettle, sometimes called a tea kettle or teakettle, is a type of pot specialized for boiling water, commonly with a lid, spout, and handle, or a small electric kitchen appliance of similar shape that functions in a self-contained manner. Kettles can be heated either by placing on a stove, or by their own internal electric heating element in the appliance versions. As indicated by its name, the kettle was and is often used as teaware to brew tea or prepare a tisane. Some very modern versions do more than just boil water, and also make the tea and keep it warm."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[5]]?.get(1)){
            binding.tvView.text = "Cookware and bakeware is food preparation equipment, such as cooking pots, pans, baking sheets etc. used in kitchens. Cookware is used on a stove or range cooktop, while bakeware is used in an oven. Some utensils are considered both cookware and bakeware."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[5]]?.get(2)){
            binding.tvView.text = "A dish in gastronomy is a specific food preparation, a \"distinct article or variety of food\",[1] ready to eat or to be served.\n" +
                    "\n" +
                    "A dish may be served on tableware, or may be eaten in one's hands.\n" +
                    "\n" +
                    "Instructions for preparing a dish are called recipes.\n" +
                    "\n" +
                    "Some dishes, for example a hot dog with ketchup, rarely have their own recipes printed in cookbooks as they are made by simply combining two ready-to-eat foods."
        }
        if (name== MyDataBase.map[MyDataBase.titleList[5]]?.get(3)){
            binding.tvView.text = "A shelf (pl: shelves)[1] is a flat, horizontal plane used for items that are displayed or stored in a home, business, store, or elsewhere. It is raised off the floor and often anchored to a wall, supported on its shorter length sides by brackets, or otherwise anchored to cabinetry by brackets, dowels, screws, or nails. It can also be held up by columns or pillars. A shelf is also known as a counter, ledge, mantel, or rack.[2] Tables designed to be placed against a wall, possibly mounted, are known as console tables, and are similar to individual shelves."
        }

    }
}