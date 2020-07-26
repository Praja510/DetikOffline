package com.muhammadprajadinata.detikoffline.model

import com.muhammadprajadinata.detikoffline.R

class NewsSport(var title: String, var desc: String, var photo: Int, var detail: String) {

    object NewsModel {
        val newList = listOf<NewsSport>(
            NewsSport("Marc Marquez Batal Race di MotoGP Andalusia",
                "detikcom | 20 Detik yang lalu",
                R.drawable.img_news10,
                "Fabio Quartararo finis terdepan di MotoGP Spanyol. Dia dibuntuti oleh Maverick Vinales dan Dovizioso. Sementara Marc Marquez gagal finis usai terpental saat balapan hanya menyisakan 4 lap lagi."),

            NewsSport("Gol ala American Football Romelu Lukaku",
                "detikcom | 2 Jam yang lalu",
                R.drawable.img_news11,
            "Romelu Lukaku tampil cemerlang saat Inter Milan mengalahkan Genoa 3-0. Gol keduanya sensasional, berlari ala pemain American Football dan gawang lawan jebol."),

            NewsSport("Shopee Liga 1: PSS Sleman Minta Operator Fair soal Jadwal",
                "detikcom | 1 Jam yang lalu",
                R.drawable.img_news12,
                "Jakarta - Shopee Liga 1 2020 direncanakan bergulir mulai 1 Oktober mendatang hingga 28 Februari 2021. PSS Sleman berharap operator menyusun jadwal dengan bijak.\n" +
                    "PT Liga Indonesia Baru (LIB) dan PSSI sebelumnya telah menyepakati Shopee Liga 1 akan bergulir kembali mulai 1 Oktober 2020. Kompetisi akan berjalan selama sekitar lima bulan, yang artinya bakal padat.\n" +
                    "\n" +
                    "Kondisi itu mesti diakui tidaklah ideal karena akan membebani para pemain. Pelatih PSS Sleman Dejan Antonic berharap penyusunan jadwal dikerjakan sebijak mungkin agar meminimalisir cedera."),

            NewsSport("Laga Penting Lawan Leicester, MU Jangan Takut",
                "detikcom | 4 Jam yang lalu",
                R.drawable.img_news13,
                " Manchester United menghadapi laga terakhir dengan pertaruhan jatah Liga Champions. Ole Gunner Solskjaer mau MU tetap main tanpa rasa takut dan menyerang.\n" +
                    "Pekan terakhir Liga Inggris musim ini diwarnai duel Leicester City vs Manchester United di King Power Stadium, Minggu (26/7/2020) malam WIB. Laga bisa disaksikan di Mola TV melalui link berikut ini.\n" +
                    "\n" +
                    "Partai menjanjikan pertarungan yang seru dan dramatis karena kedua tim memperebutkan tiket Liga Champions. MU dan Chelsea cuma terpisahkan satu poin, plus Chelsea yang juga berada di tengah persaingan mereka."),

            NewsSport("Chelsea Vs Wolverhampton: Memori Manis Si Biru",
                "detikcom | 4 Hari yang lalu",
                R.drawable.img_news14,
                "Test Data bro"),

            NewsSport("Catatan Ini Bukti Arsenal Jelek Banget",
                "detikcom | 1 Tahun yang lalu",
                R.drawable.img_news15,
                "Test Data bro"),

            NewsSport("Balapan di Jerez Lagi, Quartararo Menang Lagi?",
                "detikcom | 4 Hari yang lalu",
                R.drawable.img_news16,
                "Test Data bay"),

            NewsSport("Mourinho: Seandainya Liga Inggris Dua Pertandingan Lebih Banyak",
                "detikcom | 4 Detik yang lalu",
            R.drawable.img_news17,
            "Test Data bay")
        )
    }
}