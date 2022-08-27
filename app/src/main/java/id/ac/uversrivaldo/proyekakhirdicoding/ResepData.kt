package id.ac.uversrivaldo.proyekakhirdicoding

import java.util.ArrayList

object ResepData {

    private val resepNames = arrayOf("Pepes Jamur Tahu",
            "Bakwan Kembang Kol",
            "Urap-Urap Lezat Sehat",
            "Steak Tempe Enak",
            "Bacon Daging Kelapa",
            "Perkedel Sayuran Lembut Gurih",
            "Bakso Tempe Tanpa Daging Enak",
            "Sate Jamur Kancing Pedas Manis",
            "Kembang Kol Goreng Saus Madu",
            "Pempek Vegetarian")

    private val bahanMemasak = arrayOf("2 kotak tahu putih, 200 gr jamur tiram, suwir-suwir, 1 butir telur, 100 ml santan kental, 5 buah cabai merah, 2 lembar daun salam, 1 sdt ketumbar, 4 butir kemiri, garam dan penyedap rasa secukupnya.",
    "1 bonggol kembang kol, 2 sendok teh garam, 1 sendok teh lada hitam, 2 siung bawang putih, cincang, 1 buah bawang bombay, 1 cangkir parsley cincang, 1/2 cangkir tepung terigu, 1/3 cangkir keju parmesan parut, 1 butir telur, tepung terigu untuk pelapis, minyak goreng.",
    "200 gr kepala parut, 1 ikat kacang panjang, 1 buah wortel, 1 bungkus kecambah, 3 buah cabai rawit, 3 buah cabai merah, 1 cm terasi, 1 ruas kencur, 3 lembar daun jeruk, gula merah dan garam secukupnya, daun pisang secukupnya.",
    "300 gr tempe kukus, 3 siung bawang putih, 1/2 sdt merica, 1 sdt garam, 1 butir telur, tepung terigu serba guna secukupnya, air secukupnya, 3 sdm saus cabai, 2 sdm saus tomat, 1 sdm saus tiram, 1 buah bawang bombay, potong-potong,potongan tomat(Optional)",
    "3 cangkir besar daging kelapa yang dikerok (bukan diparut), 3 sendok makan kecap asin, 2 1/2 sendok makan liquid smoke (bisa dibeli di toko bahan-bahan makanan), 1 1/2 sendok makan sirup maple",
    "4 buah kentang, kupas dan kukus hingga matang, 3 batang daun bawang potong-potong tipis, 1 buah wortel, serut tipis, 1 butir telur, 1 sdt garam, gula secukupnya, 2 siung bawang putih haluskan, 2 siung bawang merah haluskan.",
    "150 gr tempe, 150 gr tepung tapioka, 1 butir telur, 3 siung bawang putih, haluskan, 1/2 sdt merica bubuk, air secukupnya, minyak secukupnya.",
    "100 gr jamur kancing, iris tipis, 1 sdm kecap manis, 1 siung bawang putih, haluskan, 2 buah cabai rawit, 1 sdt ketumbar, 1 butir kemiri, 1 sdt margarinm, 1/2 sdt merica bubuk.",
    "2 buah kembang kol potong-potong rendam dam air garam, 2 sdm tepung bumbu, 4 sdm tepung terigu, 2 sdm tepung tapioka, 1/3 sdt garam, cairkan dengan air secukupnya, 3 siung bawang putih, 2 sdm saus tomat, 2 sdm saus cabai, 3 sdm madu, 1 sdm gula, 1 sdm kecap manis, 1/2 sdt garam, 1 sdm minyak wijen, biji wijen sangrai, secukupnya, air secukupnya",
    "125 gram tepung terigu, 250 ml air, 1 1/4 sendok teh garam, 1/2 sendok teh kaldu jamur, 2 siung bawang putih, parut 2 butir telur, kocok lepas 225 gram tepung sagu 500 ml minyak, untuk menggoreng Rumput laut kering secukupnya, gunting dan rendam (jangan menggunakan rumput laut sudah berbumbu), Bahan saus cuko (rebus semua): 600 gram gula merah, sisir halus 1.000 ml air, 50 gram asam kandis, 4 sendok teh garam")

    private val caraMemasak   = arrayOf("1. Jamur dicuci dan diremas-remas hingga tak tersisa airnya. Hancurkan tahu dan campur dengan telur dan jamur.\n  2. Campurkan adonan dengan bumbu halus dan bumbu kasar seperti serai, daun salam dan lengkuas. Tambahkan garam dan santan secukupnya\n  3. Sendoki adonan dan bungkus dengan daun pisang. Kukus selama kurang lebih 30 menit, hingga matang.",
    "1. Kukus kembang kol selama 15 menit. Tumbuk dan campurkan dengan garam, lada, bawang putih, bawang bombang, parsley, tepung terigu dan telur.\n  2. Bentuk adonan menjadi bulat pipih. Celupkan ke dalam tepung terigu untuk pelapis.\n  3. Goreng hingga berwarna kuning keemasan dan matang kedua sisinya.",
    "1. Haluskan bumbu kelapa parut, campur dengan kelapa parut hingga rata. Bungkus dengan daun pisang. Kukus hingga matang atau kurang lebih 20 menit.\n  2. Potong-potong sayur dan rebus hingga matang, sisihkan.\n  3. Campur kelapa parut bumbu dengan sayuran yang sudah direbus. Sayur urap-urap siap dinikmati dengan ikan asin dan nasi hangat.",
    "1. Lumat tempe hingga hancur selagi hangat, haluskan bumbu bawang putih, merica dan garam, aduk rata dengan tempe. Bentuk bulat-bulat pipih adonan tempe.\n  2. Kocok lepas telur, celupkan adonan steak dan gulung di atas tepung terigu serba guna.\n  3. Goreng hingga kecokelatan atau matang.\n  4. Untuk saus, tumis bawang bombay dan tomat hingga layu, masukkan semua saus biarkan agak meletup-letup, tuang sedikit air dan masak hingga saus mengental.",
    "1. Panaskan oven pada suhu 176 derajat Celcius.\n  2. Lapisi loyang dengan kertas parchment.\n  3. Campurkan daging kelapa dengan kecap asin, liquid smoke dan sirup maple. Aduk hingga bumbu melapisi daging kelapa dengan merata.\n  4. Sebarkan daging kelapa di atas loyang dan masukkan ke dalam oven selama 12 hingga 14 menit, tergantung tingkat kerenyahan yang diinginkan. Balikkan daging kelapa dan panggang sekitar 2-4 menit lagi.\n  5. Bacon daging kelapa ini akan perlahan menjadi renyah saat suhunya sudah turun.",
    "1. Hancurkan kentang kukus dan campurkan dengan bumbu halus, garam dan gula secukupnya. Aduk rata.\n   2. Masukan sayuran, aduk rata. Bentuk bulatan perkedel.\n  3. Kocok telur, celupkan perkedel dan goreng hingga matang.",
    "1. Kukus tempe kurang lebih 20 menit atau hingga layu. Hancurkan selagi hangat dan haluskan dalam food processor bersama dengan bawang putih, garam, merica dan telur. Bisa juga diulek jika tidak punya food processor.\n  2. Setelah benar-benar halus, campur dengan tepung tapioka, beri air sedikit demi sedikit jika terlalu padat. Aduk hingga kalis dan bisa dibentuk.\n  3. Rebus air hingga mendidih. Oles tangan dengan minyak agar adonan tidak lengket di tangan dan bentuk adonan jadi bulat-bulat, masukkan ke air yang mendidih.\n  4. Lakukan hingga adonan habis, dan masak bakso tempe hingga mengapung, tandanya sudah matang.",
    "1. Iris tipis jamur, haluskan bumbu oles. Susun jamur pada batang sate.\n  2. Lumuri sate dengan bumbu oles dan rendam kurang lebih 15 menit. Panaskan teflon dan panggang hingga meresap. \n  3. Jangan terlalu lama agar jamur tidak alot. Selesai deh, siap sajikan hangat dengan saus kacang.",
    "1. Buat adonan cair dan celupkan kembang kol di dalamnya, lalu gulung di dalam adonan, goreng hingga kering dan matang. Tiriskan.\n  2. Tumis bawang putih dan masukkan semua saus, kecap manis dan gula pasir. Tuang sedikit air. Larutkan, tuang minyak wijen dan madu, aduk rata dan tes rasa. \n  3. Jika sudah pas, masukkan kembang kol goreng ke dalam saus. Aduk rata.",
    "1. Gunting-gunting rrumput laut kering dalam air supaya mengembang. Dengan catatatn rumput laut kering tersebut tipe yang memang bisa direndam dalam air, bukan rumput laut panggang yang digunakan untuk membuat kimbab.  \n  2. Dalam panci campur tepung terigu, air, garam, dan kaldu jamur  sampai rata. Nyalakan api kompor, aduk sampai mengental.  \n  3. Tuang adonan dalam baskom. Masukkan rumput laut yang sudah mengembang dan dipotong kecil-kecil. Masukkan telur. Aduk sampai rata. Tuang adonan ke atas tepung sagu, aduk lagi.  \n  4. Lumuri tangan dengan tepung sagu, ambil adonan pempek, buat bentuk adonan pastel atau bentuk seperti pempek lenjer. Sisihkan.  \n  5. Rebus air sampai mendidih, masukkan pempek, masak sampai pempek mengapung dan matang. Tiriskan.")

    private val resepImages = intArrayOf(R.drawable.pepes_jamur_tahu,
            R.drawable.bakwan_kembang_kol,
            R.drawable.urap_urap_lezat,
            R.drawable.steak_tempe,
            R.drawable.bacon_daging_kelapa,
            R.drawable.perkedel_sayuran,
            R.drawable.bakso_tempe,
            R.drawable.sate_jamur_kancing_pedas_manis,
            R.drawable.kembang_kol_goreng_saus_madu,
            R.drawable.pempek_vegetarian)

    val listData: ArrayList<Resep>
        get() {
            val list = arrayListOf<Resep>()
            for (position in resepNames.indices) {
                val resep = Resep()
                resep.name = resepNames[position]
                resep.bahan = bahanMemasak[position]
                resep.cara = caraMemasak[position]
                resep.photo = resepImages[position]
                list.add(resep)
            }
            return list
        }
}