package com.rizki.wisatajogja;

import java.util.ArrayList;

public class WisataData{
    public static String[][] data = new String[][]{

        {"Kebun Buah Mangunan", "Kecamatan Dlingo, Kabupaten Bantul", "https://media.travelingyuk.com/wp-content/uploads/2018/05/Indahnya-pemandangan-di-Mangunan.jpg",
                "Kebun buah Mangunan berada di ketinggian kurang lebih 200 mdpl, membuat tempat ini pun dijuluki sebagai negeri diatas awan. Dengan pemandangan kabut yang terbentuk tepat di depan mata, keindahannya memang luar biasa. Bisa dikatakan tempat wisata ini satu tipe dengan Kalibiru",
                "Jl. Imogiri - Dlingo, Sukorame, Mangunan, Dlingo, Bantul, Daerah Istimewa Yogyakarta 55783"},
        {"Candi Ratu Boko", "Kecamatan Prambanan, Kabupaten Sleman", "https://i2.wp.com/dolanyok.com/wp-content/uploads/Candi-Ratu-Boko-2018.jpg",
                "Candi Ratu Boko sering disebut juga Kraton Ratu Boko. Disebut Kraton Boko, karena menurut legenda situs tersebut merupakan istana Ratu Boko, ayah Lara Jonggrang. Diperkirakan situs Ratu Boko dibangun pada abad ke-8 oleh Wangsa Syailendra yang beragama Buddha, namun kemudian diambil alih oleh raja-raja Mataram Hindu",
                "Jl. Raya Piyungan - Prambanan No.KM.2, Gatak, Bokoharjo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta"},
        {"HeHa Sky View", "Kecamatan Patuk, Kabupaten Gunung Kidul", "https://cdn2.tstatic.net/tribunnews/foto/bank/images/heha-sky-view-3.jpg",
                "HeHa merupakan restoran dengan perpaduan konsep tempat makan yang memiliki spot foto berlatar pemandangan alam dan kawasan kota Jogja dari ketinggian",
                "Jl. Dlingo-Patuk No.2, RT.001/RW.001 Desa, Patuk, Kec. Patuk, Kabupaten Gunung Kidul, Daerah Istimewa Yogyakarta 55862"},
        {"Taman Sari", "Kecamatan Kraton, Kota Yogyakarta", "https://2.bp.blogspot.com/-UetF-lPluls/Vy9McVEAT8I/AAAAAAAAAO0/x-csKimtoNoKz244w_cNhZQF81DDcWuigCLcB/s1600/tamansari.jpg",
                "Taman Sari adalah situs bekas taman atau kebun istana Keraton Ngayogyakarta Hadiningrat, yang dapat dibandingkan dengan Kebun Raya Bogor sebagai kebun Istana Bogor. Kebun ini dibangun pada zaman Sultan Hamengku Buwono I (HB I) pada tahun 1758-1765/9.",
                "Wisata Taman Sari Jalan Tamanan, Patehan, Kecamatan Kraton, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55133"},
        {"Kebun Binatang Gembira Loka", "Kecamatan Kotagede, Kota Yogyakarta", "https://cdn.idntimes.com/content-images/post/20190903/53360230-279906532905233-3962137577101247180-n-0d9846088aa092cf6b5be33f4b4fd331_600x400.jpg",
                "Kebun Binatang Gembira Loka merupakan kebun binatang sekala Provinsi, yang tentu saja saran-prasarana kebun binatang wajib komplit. Selain fasilitas umum seperti mushola, kamar mandi umum, tempat parkir, disana pengunjung dapat mencoba fasilitas rekreasi wahana permainan menarik seperti perahu Katamaran yang siap membawa wisatawan berkeliling area danau kebun binatang.",
                "Jl. Kebun Raya No.2, Rejowinangun, Kec. Kotagede, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55171"},
        {"The Lost World Castle", "Kecamatan Cangkringan, Kabupaten Sleman", "https://www.kartanesia.com/wp-content/uploads/2019/05/The-Lost-World-Castle-Jogja.jpg",
                "The Lost World Castle menawarkan keindahan berupa bangunan mirip Benteng Takeshi. Wahana-wahana di sini memanfaatkan batu sisa erupsi Merapi sebagai bahan bakunya. Saat kabut turun, suasana jadi makin menarik untuk latar foto.",
                "Petung, Kepuharjo, Kec. Cangkringan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55583"},
        {"Goa Pindul", "Kecamatan Karangmojo, Kabupaten Gunung Kidul", "https://cvtugu.com/wp-content/uploads/2018/11/@rmdtourjogja.jpg",
                "Gua Pindul dikenal karena cara menyusuri gua yang dilakukan dengan menaiki ban pelampung di atas aliran sungai bawah tanah di dalam gua, kegiatan ini dikenal dengan istilah cave tubing.",
                "Dusun Gelaran II, RT.3/16, Gunungbang, Bejiharjo, Kec. Karangmojo, Kabupaten Gunung Kidul, Daerah Istimewa Yogyakarta 55891"},
        {"Goa Kalisuci", "Kecamatan Semanu, Kabupaten Gunung Kidul", "https://tourjogjamasjo.com/wp-content/uploads/2016/01/cave-tubing-1.jpg",
                "Goa Kalisuci merupakan objek wisata alam yang terletak di Gunung Kidul. Objek wisata ini menawarkan susur sungai (rafting) sekaligus susur goa (cave tubing). Kawasan ini merupakan wisata susur goa yang pertama di Indonesia.",
                "Jetis, Jonge, Pacarejo, Kec. Semanu, Kabupaten Gunung Kidul, Daerah Istimewa Yogyakarta 55893"},
        {"Tebing Breksi", "Kecamatan Prambanan, Kabupaten Sleman", "https://cdn2.tstatic.net/jogja/foto/bank/images/tebing-breksi-wisata-murah-jogja.jpg",
                "Taman Tebing Breksi adalah salah satu cagar budaya yang awalnya merupakan tambang batu breksi yang menjadi sumber pendapatan warga sekitar. Objek wisata ini digemari wisatawan karena tebing tersebut memiliki diorama yang indah",
                "Gn. Sari, Sambirejo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55572"},
        {"Malioboro", "Jalan Malioboro, Yogyakarta", "https://cdn.idntimes.com/content-images/community/2019/07/jalan-malioboro-1-696x464-1f073355a40f21f19ae69dc8240887c9_600x400.jpg",
                "Malioboro adalah nama salah satu kawasan jalan dari tiga jalan di Kota Yogyakarta yang membentang dari Tugu Yogyakarta hingga ke perempatan Kantor Pos Yogyakarta. Secara keseluruhan terdiri dari Jalan Margo Utomo, Jalan Malioboro, dan Jalan Margo Mulyo. Jalan ini merupakan poros Garis Imajiner Kraton Yogyakarta",
                "Jalan Malioboro, Yogyakarta"},
        {"Candi Ijo", "Kecamatan Prambanan, Kabupaten Sleman", "https://jogjamotor.net/wp-content/uploads/2018/05/Candi-Ijo-6.jpg",
               "Candi Ijo adalah sebuah kompleks percandian bercorak Hindu, berada 4 kilometer arah tenggara dari Candi Ratu Boko atau kira-kira 18 kilometer di sebelah timur kota Yogyakarta. Candi ini diperkirakan dibangun antara kurun abad ke-10 sampai dengan ke-11 Masehi pada saat zaman Kerajaan Medang periode Mataram",
               "Kikis, Sambirejo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55572"},
        {"Pantai Parangtritis", "Kecamatan Kretek, Kabupaten Bantul", "https://eksotisjogja.com/wp-content/uploads/2016/08/parangtritis.jpg",
               "Pantai Parangtritis merupakan objek wisata yang cukup terkenal di Yogyakarta selain objek pantai lainnya seperti Samas, Baron, Kukup, Krakal dan Glagah. Parangtritis mempunyai keunikan pemandangan yang tidak terdapat pada objek wisata lainnya yaitu selain ombak yang besar juga adanya gunung-gunung pasir di sekitar pantai, yang biasa disebut gumuk",
               "Kecamatan Kretek, Bantul, Daerah Istimewa Yogyakarta, Indonesia."},
    };

        public static ArrayList<Wisata> getListData(){
            Wisata destinasi = null;
            ArrayList<Wisata> list = new ArrayList<>();
            for (String[] aData : data) {
                destinasi = new Wisata();
                destinasi.setName(aData[0]);
                destinasi.setRemarks(aData[1]);
                destinasi.setPhoto(aData[2]);
                destinasi.setDeskripsi(aData[3]);
                destinasi.setLokasi(aData[4]);

                list.add(destinasi);
            }

            return list;
        }
}
