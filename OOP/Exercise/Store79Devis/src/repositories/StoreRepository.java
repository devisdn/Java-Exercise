package repositories;

import java.util.*;

import childs.*;
import parents.*;

public class StoreRepository {
        public static List<Product> getAllProduct() {

                Product food1 = new FoodAndBeverage("FD001", "FoodandBeverages", "Salt Cheese", 5000.0, 500, "FD001",
                                "13/09/2022", "13/09/2023", "terigu,telur,penyedap rasa,keju.", "Halal MUI");
                Product food2 = new FoodAndBeverage("OR01", "FoodandBeverages", "Oreo", 4000.0, 1000, "OR01",
                                "13/09/2021", "13/12/2022", "terigu,telur,gula,coklat,minyak palm.", "Halal MUI");
                Product food3 = new FoodAndBeverage("MSD01", "FoodandBeverages", "Mie Sedap Soto", 2000.0, 2000,
                                "MSD01", "13/09/2018", "13/09/2024",
                                "Tepung terigu, minyak sayur, garam, pengental nabati, pengatur keasaman, pewarna (tartrazin CI 19140), dan zat besi.",
                                "Halal BPOM");
                Product food4 = new FoodAndBeverage("DC01", "FoodandBeverages", "Susu Dancow UHT", 20000.0, 1000,
                                "DC01", "15/06/2022", "15/12/2022",
                                "Susu sapi segar, sukrosa, susu bubuk skim, perisa identik alami, pengemulsi nabati (mengandung lesitin kedelai), premiks vitamin, 3 mineral.",
                                "Halal BPOM");
                Product food5 = new FoodAndBeverage("PS01", "FoodandBeverages", "Pepsi", 10000.0, 500, "PS01",
                                "01/01/2022", "01/01/2024",
                                "Carbonated water, sugar, acidity regulators (phosphoric acid, citric acid & sodium citrate), natural cola flavorings, caffeine, sodium benzoate preservative, arabic GOM stabilizer, food coloring (blue diamond Cl 42090 and allura red Cl 16035).",
                                "Halal MUI");
                Product food6 = new FoodAndBeverage("UC01", "FoodandBeverages", "UC 1000 Vit C", 4000.0, 1500, "UC01",
                                "12/05/2018", "13/05/2019",
                                "100% jus buah orange segar 7.2 mg, natrium klorida, kalsium laktat, magnesium klorida, kalium fosfat, fruktosa, gula, orange flavour, beta carotene, pengatur keasaman dan air hingga 500 ml.",
                                "Halal BPOM");
                Product foodAndBeverage7 = new FoodAndBeverage("T01", "FoodandBeverages", "Tango rasa Vanilla", 14000.0,
                                20, "11102022", "10102020", "11 Oktober 2022",
                                "Tepung terigu, gula, lemak nabati, kakao bubuk, susu bubuk, pengemulsi lesitin kedelai, garam, tepung telur, pengembang natrium bikarbonat, kakao massa, vanillin",
                                "MUI Halal");
                Product foodAndBeverage8 = new FoodAndBeverage("T02", "FoodandBeverages", "Tango rasa rumput laut",
                                12000.0, 40, "05012023", "10 Januari 2021", "5 Januari 2023",
                                "Tepung terigu, minyak nabati, tapioka, bumbu rasa rumput laut (mengandung penguat rasa mononatrium glutamat, dinatrium inosinat dan guanilat, rumput laut kering, perisa identik alami rumput laut, hidrolisat protein nabati, pewarna karamel kelas IE 150a), gula, garam, pengembang",
                                "BPOM");
                Product foodAndBeverage9 = new FoodAndBeverage("CH01", "FoodandBeverages", "Chitato rasa mie goreng",
                                18000.0, 15, "20112023", "10 Februari 2021", "20 November 2023",
                                " kentang 63%, minyak olein kelapa sawit, bumbu rasa mi goreng kornet (mengandung maltodekstrin, gula, bawang putih bubuk, penguat rasa mononatrium glutamat, dinatrium ribonukleotida, pewarna karamel I dan karmin CI 75470, antioksidan alfa tokoferol), ekstrak daging sapi",
                                "MUI Halal");
                Product foodAndBeverage10 = new FoodAndBeverage("KG01", "FoodandBeverages", "Garuda Kacang Panggang",
                                9000.0, 47, "18122024", "18 Desember 2020", "18 Desember 2024",
                                "Kacang tanah, tepung terigu, pati termodifikasi, gula, minyak nabati, bumbu rasa bawang (mengandung penguat rasa mononatrium glutamat), garam, pengembang amonium bikarbonat antioksidan TBHQ",
                                "BPOM");
                Product foodAndBeverage11 = new FoodAndBeverage("T03", "FoodandBeverages",
                                "Dua Kelinci Jagung Bakar", 8000.0, 25, "19062023", "19 Juni 2020", "19 Juni 2023",
                                "Jagung (65.61%), Minyak Sawit (mengandung Antioksidan TBHQ (E319)), Pati Jagung, Bumbu Jagung Bakar [mengandung Gula, Garam, Maltodekstrin, Padatan Susu, Glukosa, Protein Kedelai Terhidrolisis, Kecap Bubuk, Sayuran Bubuk",
                                "MUI Halal");
                Product foodAndBeverage12 = new FoodAndBeverage("CB01", "FoodandBeverages",
                                "Chiki Balls Chicken 200G", 22000.0, 16, "07082023", "07 Agustus 2020",
                                "07 Agustus 2023",
                                "Jagung, minyak olein kelapa sawit, beras, bumbu, garam, gula, penguat rasa mononatrium glutamat, dinatrium guanilat dan dinatrium inosinat, minyak dan lemak nabati, antioksidan asam askorbat, kedelai, minyak bawang",
                                "BPOM");
                Product foodAndBeverage13 = new FoodAndBeverage("BEVGIT", "FoodandBeverages", "Thai Milk Tea",
                                5000.0, 480, "ICTGRT", "12 April 2022", "12 April 2023", "Milk", "Halal");
                Product foodAndBeverage14 = new FoodAndBeverage("FODBR", "FoodandBeverages", "Babi Rica Rica",
                                80000.0, 5, "BBRCRC", "12 September 2022", "15 Sepetember 2022", "Pork", "Non Halal");
                Product foodAndBeverage15 = new FoodAndBeverage("FODDRT", "FoodandBeverages", "Doritos Balado",
                                6500.0, 240, "DRTBLD", "14 Maret 2022", "14 Desember 2022", "Corn", "Halal");
                Product foodAndBeverage16 = new FoodAndBeverage("FODBNC", "FoodandBeverages",
                                "Bon Cabe Level 30", 7000.0, 100, "BNCL30", "11 Januari 2022", "30 Oktober 2022",
                                "Chili", "Halal");
                Product foodAndBeverage17 = new FoodAndBeverage("BEVLTM", "FoodandBeverages",
                                "Lactamil Pregnasis", 90000.0, 7, "LTMPRG", "20 Agustus 2022", "20 Agustus 2024",
                                "Milk", "Halal");
                Product foodAndBeverage18 = new FoodAndBeverage("BEVVSO", "FoodandBeverages",
                                "V-Soy Susu Kedelai", 5000.0, 150, "VSYSKD", "14 Agustus 2022", "14 Agustus 2023",
                                "soy milk", "Halal");
                Product food19 = new FoodAndBeverage("F0019", "FoodandBeverages", "Chocodot Mini", 5000.0, 200,
                                "PF019", "13 September 2022", "13 Maret 2023", "Cokelat, Dodol", "Halal MUI");
                Product food20 = new FoodAndBeverage("F0020", "FoodandBeverages", "Baso Aci Boci", 17000.0, 300,
                                "PF020", "13 September 2022", "13 Desember 2022",
                                "Tepung tapioka, Tepung terigu, Garam", "Halal MUI");
                Product food21 = new FoodAndBeverage("F0021", "FoodandBeverages", "Mie Instant Ramen Gorilla",
                                13000.0, 450, "PF021", "13 September 2022", "13 Desember 2022",
                                "Tepung terigu, Garam, Sodium bikarbonat, Minyak Goreng", "Halal MUI");
                Product food22 = new FoodAndBeverage("B0022", "FoodandBeverages", "Aqua Botol 600 ml", 3000.0,
                                150,
                                "PF022",
                                "13 September 2022", "13 September 2024", "Air Mineral", "Halal BPOM");
                Product food23 = new FoodAndBeverage("B0023", "FoodandBeverages",
                                "Goodday Funtastic Moccacino 250 ml",
                                7000.0,
                                1000, "PF023", "13 September 2022", "13 September 2023",
                                "Air, Gula, Krimer nabati, Kopi, Susu skim bubuk, Bubuk kakao", "Halal BPOM");
                Product food24 = new FoodAndBeverage("B0024", "FoodandBeverages", "Nu Milk Tea 330 ml", 6700.0,
                                500,
                                "PF024",
                                "13 September 2022", "13 September 2023", "Air, Daun teh, Gula, Susu bubuk, Nabati",
                                "Halal BPOM");
                Product fnb25 = new FoodAndBeverage("TP0001", "FoodandBeverages", "Teh Poci", 2000.0, 50,
                                "TP0001",
                                "13 September 2022", "1 Januari 2023", "Air, Gula, Daun Teh Kering, Es", "MUI Halal");
                Product fnb26 = new FoodAndBeverage("UM0001", "FoodandBeverages", "Ultra Milk Coklat", 4000.0,
                                72,
                                "UM0001", "12 September 2022", "1 Juni 2023", "Susu, Gula, Perasa Buah", "MUI Halal");
                Product fnb27 = new FoodAndBeverage("CT0001", "FoodandBeverages", "Chitato Rumput Laut",
                                5000.0, 72,
                                "CT0001", "29 Agustus 2022", "5 September 2023", "Kentang, Garam, Bubuk Lada",
                                "MUI Halal");
                Product fnb28 = new FoodAndBeverage("AM0001", "FoodandBeverages", "Jamu Kemasan Botol",
                                50000.0, 24,
                                "AM0001", "12 September 2022", "12 September 2023", "Alkohol 5%, Air, Perasa Anggur",
                                "Food Certified");
                Product fnb29 = new FoodAndBeverage("SR0001", "FoodandBeverages", "Sari Roti Tawar", 12000.0,
                                24,
                                "SR0001", "12 September 2022", "17 September 2022", "Terigu, Susu, Telur", "MUI Halal");
                Product fnb30 = new FoodAndBeverage("IM0001", "FoodandBeverages", "Indomie Ayam Geprek",
                                2500.0, 36,
                                "IN0001", "20 September 2022", "30 Agustus 2022", "Terigu, Telur, Minyak Nabati",
                                "MUI Halal");

                Product garment1 = new Garment("CHB01", "Garment", "Baju Tidur Bayi", 35000.0, 36, "CHB01",
                                "05/10/2022",
                                "Baju Tidur",
                                "Garut Kids Cloth", "Biru Muda", 4, "Bayi");
                Product garment2 = new Garment("CHD02", "Garment", "Baju Kaos Dewasa", 100000.0, 150, "CHD02",
                                "05/10/2023",
                                "Baju Kaos", "Bazoka Cloth", "Red", 9, "Dewasa");
                Product garment3 = new Garment("GN01", "Garment", "Baju Gamis Wanita dengan Hijab", 150000.0, 20,
                                "GN01",
                                "05/03/2022",
                                "Baju Gamis", "Amanah Cloth", "Pink", 8, "Dewasa");
                Product garment4 = new Garment("JKT01", "Garment", "Jaket Muslim Wanita", 250000.0, 100, "JKT01",
                                "05/10/2022",
                                "Jaket Muslimah", "Hijacket", "Hijau", 8, "Dewasa");
                Product garment5 = new Garment("SPT01", "Garment", "Sepatu Kulit Pria", 180000.0, 50, "SPT01",
                                "05/09/2022",
                                "Sepatu Kulit", "Sukaregang Leather", "Hitam", 40, "Dewasa");
                Product garment6 = new Garment("SDL01", "Garment", "Sandal Kulit Wanita", 35000.0, 70, "SDL01",
                                "01/01/2022",
                                "Sandal Kulit", "Sukaregang Leather", "Biru Muda", 38, "Dewasa");
                Product garment7 = new Garment("K01", "Garment", "kemeja Kantor", 140000.0, 100, "H0119",
                                "11 Agustus 2021",
                                "Kemeja panjang", "H&M", "Hitam", 32, "Dewasa");
                Product garment8 = new Garment("J01", "Garment", "jaket Zara Original", 1500000.0, 15, "Z0211",
                                "11 Agustus 2019", "Jaket", "Zara", "Hitam", 33, "Dewasa");
                Product garment9 = new Garment("CJ01", "Garment", "Celana Panjang Jeans Denim Pria Bleach",
                                199000.0, 30,
                                "C1164", "11 Agustus 2020", "Celana panjang", "Levi's", "Hitam", 29, "Dewasa");
                Product garment10 = new Garment("SW01", "Garment", "Sweater Nevada Polos cewe original", 99000.0,
                                200,
                                "N0382", "11 September 2020", "Sweater", "Nevada", "Biru, Kuning, Putih", 27 - 33,
                                "Dewasa");
                Product garment11 = new Garment("BL01", "Garment", "blouse navy polkadot", 140000.0, 1000, "B0119",
                                "11 Desember 2022", "Kemeja", "Barybenka", "Biru", 25 - 39, "Dewasa");
                Product garment12 = new Garment("B01", "Garment", "Baju Anak-anak", 100000.0, 1000, "B0119",
                                "13 Oktober 2021",
                                "baju Anak-anak", "H&M", "Hitam, biru, kuning, merah", 12 - 18, "Anak-anak");
                Product garment13 = new Garment("GRMPLO", "Garment", "polo raphralurent White", 300000.0, 48, "PLORPW",
                                "14 February 2022", "Polo Shirt", "Kahatex", "White", 42, "Dewasa");
                Product garment14 = new Garment("GRMSTI", "Garment", "STONE ISLAND GD BRUSHED COTTON ZIP", 4000000.0,
                                12,
                                "STIGDB",
                                "15 April 2018", "ZIP", "Pou Yen", "Black", 44, "Dewasa");
                Product garment15 = new Garment("GRMFLA", "Garment", "Fila Expo 2", 700000.0, 48, "FLAXPO",
                                "15 April 2015",
                                "Outwear", "Perdana", "Blue Navy", 42, "Dewasa");
                Product garment16 = new Garment("GRMCPC", "Garment", "CP Company Goole", 2000000.0, 100, "CPCGOG",
                                "19 Agustus 2021",
                                "Outwear", "Jim Myoung", "Black", 43, "Lansia");
                Product garment17 = new Garment("GRMDRS", "Garment", "Vero moda Earty", 800000.0, 12, "DRSVRO",
                                "15 Agustus 2022", "Dress", "Kahatex", "Yellow", 34, "Anak - anak");
                Product garment18 = new Garment("GRMJNS", "Garment", "Uniqlo Denim Black", 300000.0, 400, "UNQDBL",
                                "20 Agustus 2022",
                                "Denim", "Yolita", "Black", 42, "Dewasa");
                Product garment19 = new Garment("G0019", "Garment", "Kaos Java Code", 80000.0, 150, "PG019",
                                "13 September 2022",
                                "V-Neck", "Cotton combed 30s", "Hitam", 30, "Dewasa");
                Product garment20 = new Garment("G0020", "Garment", "Kaos Screamous", 50000.0, 250, "PG020",
                                "13 September 2022",
                                "Raglan", "Cotton combed 20s", "Hitam Abu", 34, "Dewasa");
                Product garment21 = new Garment("G0021", "Garment", "Jacket Jeans", 250000.0, 30, "PG021",
                                "13 September 2022",
                                "Trucker", "Jeans", "Biru", 40, "Dewasa");
                Product garment22 = new Garment("G0022", "Garment", "Jaket Squish TPkids", 150000.0, 200, "PG022",
                                "13 September 2022", "Bomber", "Fleece", "Navy", 14, "Bayi");
                Product garment23 = new Garment("G0023", "Garment", "Kemeja Polos", 120000.0, 500, "PG023",
                                "13 September 2022",
                                "Formal", "Flanel", "White", 30, "Dewasa");
                Product garment24 = new Garment("G0024", "Garment", "Kemeja Polos Anak", 100000.0, 150, "PG024",
                                "13 September 2022",
                                "Formal", "Flanel", "Hitam", 24, "Anak");
                Product garment25 = new Garment("HM0001", "Garment", "HnM Sky Black Long Pants", 100000.0, 20, "J0023",
                                "10 September 2022", "Long Pants", "Jeans", "Black", 42, "Dewasa");
                Product garment26 = new Garment("HM0002", "Garment", "HnM Jet Blue TShirt", 150000.0, 20, "J0059",
                                "20 Oktober 2022", "TShirt", "Cotton", "Blue", 36, "Remaja");
                Product garment27 = new Garment("BT0001", "Garment", "Bata Super Yellow Pair Shoes", 200000.0, 20,
                                "A0043",
                                "1 Desember 2021", "Shoes", "Leather", "Brown-Yellow", 42, "Dewasa");
                Product garment28 = new Garment("HP0001", "Garment", "HommyPed Kiddie Flash Shoes", 100000.0, 20,
                                "B0023",
                                "1 Desember 2021", "Shoes", "Nylon Mesh", "Grey", 28, "Anak");
                Product garment29 = new Garment("HP0002", "Garment", "HommyPed Sleep Suit", 50000.0, 20, "B0033",
                                "1 Desember 2021",
                                "Shirt", "Cotton", "White", 15, "Baby");
                Product garment30 = new Garment("NK0001", "Garment", "Nike Air Jordan", 2000000.0, 5, "N0001",
                                "1 Januari 2022",
                                "Shoes", "Leather", "Red White", 42, "Dewasa");

                Product materials1 = new Materials("BT01", "Material", "Batu Bata", 500.0, 100000, "BT01",
                                "04/05/2022",
                                "none",
                                "Material", false);
                Product materials2 = new Materials("KT01", "Material", "Kulit Sapi", 200000.0, 100, "KT01",
                                "04/09/2022",
                                "04/04/2023", "Material", false);
                Product materials3 = new Materials("CS01", "Material", "Keju Cheddar", 7000.0, 200, "CS01",
                                "04/05/2021",
                                "04/05/2022", "Material", true);
                Product materials4 = new Materials("SG01", "Material", "Gula Pasir", 20000.0, 100, "SG01",
                                "10/01/2022",
                                "10/01/2023", "Material", true);
                Product materials5 = new Materials("TG01", "Material", "Terigu", 15000.0, 500, "TG01", "04/07/2021",
                                "04/11/2022", "Material", true);
                Product materials6 = new Materials("AC01", "Material", "Air Accu", 5000.0, 300, "AC01", "04/05/2022",
                                "04/05/2024", "Bahan Kimia", false);
                Product material7 = new Materials("M01", "Material", "Besi", 20000.0, 10000, "B111220010",
                                "11/8/2021",
                                "none",
                                "Material", false);
                Product material8 = new Materials("S01", "Material", "Sendok", 2000.0, 10000, "S120920019",
                                "07/9/2020",
                                "none",
                                "Alat Makan", false);
                Product material9 = new Materials("GJ01", "Material", "Gula jawa", 12000.0, 70, "GJ091120021",
                                "09/11/2021",
                                "09/11/2022", "Material", true);
                Product material10 = new Materials("G01", "Material", "Garam", 8000.0, 9000, "G100120021",
                                "10/01/2021",
                                "10/01/2030", "Bahan Masakan", true);
                Product material11 = new Materials("CT01", "Material", "Cat Tembok", 40000.0, 100, "CT050620020",
                                "05/06/2020",
                                "05/06/2025", "Material", false);
                Product material12 = new Materials("G01", "Material", "Garpu", 2000.0, 10000, "G130220009",
                                "13/02/2009",
                                "none",
                                "Alat Makan", false);
                Product material13 = new Materials("MTRGLT", "Material", "beef gelatin", 140000.0, 10000, "GLTBEF",
                                "17 agustus 2022",
                                "17 agustus 2024", "collagen extraction", true);
                Product material14 = new Materials("MTRSSN", "Material", "Pink Sea Sand", 50000.0, 10000, "PNKSSN",
                                "20 April 2022", "20 April 2025", "Sand", false);
                Product material15 = new Materials("MTRTWD", "Material", "Jepara Teak Wood", 1000000.0, 180, "JPRTWD",
                                "2 September 2022",
                                "2 September 2026", "Building Material", false);
                Product material16 = new Materials("MTRBTR", "Material", "Black Truffle Mushroom", 40000.0, 16,
                                "MHRBTR",
                                "11 Mei 2022", "11 Mei 2023", "Food Material", true);
                Product material17 = new Materials("MTRVLN", "Material", "Tidy Vinyl", 700000.0, 900, "TDVYL",
                                "20 Agustus 2022", "20 Agustus 2026", "Wood", false);
                Product material18 = new Materials("MTRCTN", "Material", "Supernova Cotton Fabric", 200000.0, 10000,
                                "SPNCTN",
                                "7 Desember 2021", "7 Desember 2027", "cotton fiber", false);
                Product material19 = new Materials("M0019", "Material", "Wijsman Butter 250 g", 120000.0, 100,
                                "PM019",
                                "13 September 2022", "13 September 2023", "Mentega", true);
                Product material20 = new Materials("M0020", "Material", "Himalaya Black Truffle", 4880000.0, 400,
                                "PM020",
                                "13 September 2022", "13 September 2023", "Jamur", true);
                Product material21 = new Materials("M0021", "Material", "Caviar Beluga 300 gr", 29000000.0, 160,
                                "PM021",
                                "13 September 2022", "13 September 2023", "Telur", true);
                Product material22 = new Materials("M0022", "Material", "Wasabi Pasta 43 gr", 60000.0, 200,
                                "PM022",
                                "13 September 2022", "13 September 2023", "Wasabi", true);
                Product material23 = new Materials("M0023", "Material", "Semen Tiga Roda 50 kg", 72500.0, 1000,
                                "PM023",
                                "13 September 2022", "-", "Semen", false);
                Product material24 = new Materials("M0024", "Material", "Nippon Paint Blue 1 kg", 69900.0, 300,
                                "PM024",
                                "13 September 2022", "-", "Cat", false);
                Product material25 = new Materials("SN0001", "Material", "Pasir Putih", 1500000.0, 21, "P0001",
                                "1 Januari 2022",
                                "1 Januari 2032", "Material", false);
                Product material26 = new Materials("SN0002", "Material", "Pasir Hitam", 1600000.0, 21, "P0002",
                                "1 Januari 2022",
                                "1 Januari 2032", "Material", false);
                Product material27 = new Materials("DP0001", "Material", "Citric Acid", 5000.0, 75, "C0003",
                                "1 Januari 2022",
                                "1 Januari 2023", "Bahan Dapur", true);
                Product material28 = new Materials("DP0002", "Material", "Sucrose", 30000.0, 75, "C0003",
                                "1 Januari 2022",
                                "1 Januari 2023", "Bahan Dapur", true);
                Product material29 = new Materials("BK0001", "Material", "Hidrogen Chlorida", 36000.0, 25, "K0001",
                                "1 Januari 2022", "1 Januari 2023", "Bahan Kimia", false);
                Product material30 = new Materials("BK0002", "Material", "Dihidrogen Monoksida", 5000.0, 25, "K0002",
                                "1 Januari 2022", "TBA", "Bahan Kimia", true);

                Product transportations1 = new Transportations("OJK01", "Transportation", "Ojek Pangkalan",
                                5000.0,
                                20,
                                "fixperroute", "Sepeda Motor", "Karangpawitan-Suci");
                Product transportations2 = new Transportations("DL01", "Transportation", "Delman", 15000.0, 50,
                                "fixperroute",
                                "Kereta Kuda", "Karangpawitan-Wanaraja");
                Product transportations3 = new Transportations("OGB01", "Transportation", "Ojek Grab", 5000.0,
                                100,
                                "permiles",
                                "Sepeda Motor", 5.0);
                Product transportations4 = new Transportations("ID01", "Transportation", "Ojek InDriver",
                                4000.0, 75,
                                "permiles",
                                "Sepeda Motor", 10.0);
                Product transportations5 = new Transportations("PST01", "Transportation",
                                "Pesawat Terbang Garuda Indonesia",
                                1000000.0, 20, "fixperroute", "Pesawat Terbang", "Jakarta - Bali");
                Product transportations6 = new Transportations("KPL01", "Transportation",
                                "Kapal Feri Pesona Indonesia",
                                150000.0,
                                10, "fixperroute", "Kapal Laut", "Pelabuhan Merak - Bakauheni");
                Product transportation7 = new Transportations("AKT01", "Transportation", "Angkutan Umum",
                                5000.0, 20,
                                "fixperroute", "Angkutan umum", "pasar Wage - Purwokerto Alun-alun");
                Product transportations8 = new Transportations("KPL01", "Transportation", "Garuda Indonesia",
                                350000.0,
                                10, "fixperroute", "Pesawat Terbang", "Jakarta-Malaysia");
                Product transportation9 = new Transportations("GC01", "Transportation", "Grab Car", 20000.0,
                                20,
                                "perMiles", "Mobil", 3.0);
                Product transportations10 = new Transportations("GJK01", "Transportation", "Gojek", 10000.0,
                                10,
                                "perMiles", "Motor", 3.0);
                Product transportation11 = new Transportations("AKT01", "Transportation",
                                "Kereta Api Indonesia",
                                150000.0, 100, "fixperroute", "Kereta Api", "Purwokerto - Jogjakarta");
                Product transportations12 = new Transportations("KPL01", "Transportation", "Bus Sinar jaya",
                                130000.0,
                                30, "fixperroute", "Bus", "Jogjakarta - Jakarta");
                Product transportation13 = new Transportations("TRSTMB", "Transportation",
                                "Trans Metro Bandung",
                                10000.0,
                                50,
                                "fixperroute", "Bus", "Cimindi - Gatsu");
                Product transportation14 = new Transportations("TRSTKG", "Transportation", "Tongkang Cirata",
                                15000.0,
                                20,
                                "fixperroute", "Boot", "Cirata - Saguling");
                Product transportation15 = new Transportations("TRSTEB", "Transportation", "Teman Bus", 5000.0,
                                60,
                                "fixperroute", "Bus", "Kota Baru - Alun Alun Bandung");
                Product transportation16 = new Transportations("TRSKCI", "Transportation",
                                "Kereta Cepat Jakarta - Bandung",
                                300000.0, 500, "fixperroute", "Train", "Jakarta - Bandung");
                Product transportation17 = new Transportations("TRSBJJ", "Transportation", "Bajaj Batujajar",
                                4000.0, 2,
                                "permiles", "motorcycle", 10.0);
                Product transportation18 = new Transportations("TRSMNR", "Transportation", "Monorel Dago",
                                11000.0, 30,
                                "permiles", "Train", 7.1);
                Product transport19 = new Transportations("TR019", "Transportation", "Uber", 20000.0, 1000,
                                "permiles",
                                "Car",
                                10.0);
                Product transport20 = new Transportations("TR020", "Transportation", "Jajap Garut", 10000.0,
                                100,
                                "permiles",
                                "Bike", 5.0);
                Product transport21 = new Transportations("TR021", "Transportation", "Anterin", 8000.0, 200,
                                "permiles",
                                "Bike",
                                4.0);
                Product transport22 = new Transportations("TR022", "Transportation", "Shinkansen", 200000.0,
                                1000,
                                "fixperroute",
                                "Train", "Garut - Yogyakarta");
                Product transport23 = new Transportations("TR023", "Transportation", "Bitcar", 100000.0, 500,
                                "fixperroute",
                                "Car", "Jakarta");
                Product transport24 = new Transportations("TR024", "Transportation", "Bojek", 20000.0, 70,
                                "fixperroute",
                                "Bike",
                                "Bogor");
                Product transportation25 = new Transportations("RS0001", "Transportation", "Bis Malam Rosalia Indah",
                                250000.0,
                                300,
                                "FixPerRoute", "Bus", "Jakarta-Yogyakarta");
                Product transportation26 = new Transportations("MG0001", "Transportation", "Bis MGI", 75000.0, 201,
                                "FixPerRoute",
                                "Bus", "Leuwiliang-Bandung");
                Product transportation27 = new Transportations("GR0001", "Transportation", "Grab Bike", 8000.0, 301,
                                "PerMiles",
                                "Motorbike", 3.5);
                Product transportation28 = new Transportations("GJ0001", "Transportation", "Gojek Ride", 2300.0, 100,
                                "PerMiles",
                                "Motorbike", 1.5);
                Product transportation29 = new Transportations("TR0001", "Transportation", "Travel Agent 001", 150000.0,
                                500,
                                "FixPerRoute", "MiniBus", "Bogor-Bandung");
                Product transportation30 = new Transportations("TX0001", "Transportation", "Taxi BlueBird", 4100.0, 300,
                                "PerMiles",
                                "Taxi", 2.2);

                Product tele1 = new Telecomunications("IDH01", "Telecomunication", "Indihome", 300000.0, 500,
                                "per paket",
                                "Default", "20 Mbps", 30);
                Product tele2 = new Telecomunications("BZN01", "Telecomunication", "BizzNet", 200000.0, 100,
                                "per paket",
                                "Default", "30 Mbps", 30);
                Product tele3 = new Telecomunications("THR01", "Telecomunication", "Paket Home 117 GB Three",
                                117000.0, 10,
                                "per paket", "Data", "15 Mbps", 30);
                Product tele4 = new Telecomunications("BYU01", "Telecomunication", "Internet Murah By U",
                                150000.0,
                                50,
                                "per peket", "Data", "30 Mbps", 30);
                Product tele5 = new Telecomunications("IND01", "Telecomunication", "Indosat", 10000.0, 500,
                                "per second",
                                "Default", "50 Mbps", 3);
                Product tele6 = new Telecomunications("XL01", "Telecomunication", "XL Seharian Social Media",
                                5000.0,
                                40,
                                "per paket", "Default", "30 Mbps", 1);
                Product telecomunication7 = new Telecomunications("B01", "Telecomunication", "BizzNet",
                                180000.0,
                                100,
                                "per paket", "Default", "30 Mbps", 30);
                Product telecomunication8 = new Telecomunications("INH01", "Telecomunication", "Indihome",
                                260000.0,
                                100,
                                "per paket", "Default", "25 Mbps", 30);
                Product telecomunication9 = new Telecomunications("XL01", "Telecomunication", "XL", 60000.0,
                                30,
                                "per paket",
                                "Default", "25 Mbps", 30);
                Product telecomunication10 = new Telecomunications("S01", "Telecomunication", "Simpati",
                                100000.0,
                                40,
                                "per paket", "Default", "30 Mbps", 30);
                Product telecomunication11 = new Telecomunications("INH01", "Telecomunication", "Indoosat",
                                70000.0,
                                50,
                                "per paket", "Default", "25 Mbps", 30);
                Product telecomunication12 = new Telecomunications("INH01", "Telecomunication", "3", 70000.0,
                                30,
                                "per paket",
                                "Default", "25 Mbps", 30);

                Product telecommunication13 = new Telecomunications("TLCTSK", "Telecomunication",
                                "Telkomsel sakti 80GB",
                                80000.0,
                                1000, "PerPacket", "data", "80 GB", 30);
                Product telecommunication14 = new Telecomunications("TLCPKB", "Telecomunication",
                                "Telkomsel Paket Bicara All operator", 100000.0,
                                100, "PerPacket", "data", "Sepuasnya", 30);

                Product telecommunication15 = new Telecomunications("TLCVDO", "Telecomunication",
                                "Video Diamond Mobile",
                                60000.0,
                                100, "PerPacket", "data", "1000 GB", 30);

                Product telecommunication16 = new Telecomunications("TLCPDT", "Telecomunication",
                                "Paket Darurat Telpon",
                                10000.0,
                                100, "PerSecond", "Default", "120 Menit", 1);

                Product telecommunication17 = new Telecomunications("TLCPDI", "Telecomunication",
                                "Paket Darurat Internet", 15000.0, 150, "PerSecond", "Default", "1.5 GB", 1);
                Product telecommunication18 = new Telecomunications("TLCIDP", "Telecomunication",
                                "ID Plat 4 Bulan + 2 Bulan", 1000000.0, 5, "per paket", "Default", "Unlimited", 180);
                Product tele19 = new Telecomunications("TE019", "Telecomunication",
                                "Paket OMG Telkomsel 17 GB", 100000.0, 500, "perpacket", "data", "100 Mbps", 30);
                Product tele20 = new Telecomunications("TE020", "Telecomunication",
                                "Paket OMG Telkomsel 32 GB", 150000.0, 200, "perpacket", "data", "70 Mbps", 30);
                Product tele21 = new Telecomunications("TE021", "Telecomunication",
                                "Paket OMG Telkomsel 37 GB", 182000.0, 100, "perpacket", "data", "60 Mbps", 30);
                Product tele22 = new Telecomunications("TE022", "Telecomunication",
                                "Paket HOTPROMO Telkomsel 80 GB", 155000.0, 100, "perpacket", "default", "100 Mbps",
                                30);
                Product tele23 = new Telecomunications("TE023", "Telecomunication",
                                "Paket HOTPROMO Telkomsel 500 MB", 5000.0, 500, "perpacket", "default", "50 Mbps", 1);
                Product tele24 = new Telecomunications("TE024", "Telecomunication",
                                "Paket HOTPROMO Telkomsel 120 GB", 210000.0, 50, "perpacket", "default", "100 Mbps",
                                30);
                Product telecommunication25 = new Telecomunications("VD0001", "Telecomunication", "Vodafone", 220000.0,
                                500, "PerPacket", "Data", "150 Mbps", 30);
                Product telecommunication26 = new Telecomunications("ST0001", "Telecomunication",
                                "Singapore Telecommunications", 200000.0, 600, "PerSecond", "Default", "100 Mbps", 20);
                Product telecommunication27 = new Telecomunications("TM0001", "Telecomunication", "T-Mobile", 150000.0,
                                300, "PerPacket", "Default", "200 Mbps", 30);
                Product telecommunication28 = new Telecomunications("CC0001", "Telecomunication", "Comcast", 125000.0,
                                200, "PerPacket", "Data", "500 Mbps", 30);
                Product telecommunication29 = new Telecomunications("SP0001", "Telecomunication", "Spectrum", 100000.0,
                                201, "PerSecond", "Default", "200 Mbps", 30);
                Product telecommunication30 = new Telecomunications("VZ0001", "Telecomunication", "Verizon", 175000.0,
                                202, "PerSecond", "Default", "50 Mbps", 30);

                List<Product> listProduct = new ArrayList<Product>(Arrays.asList(
                                food1, food2, food3, food4, food5, food6,
                                foodAndBeverage7, foodAndBeverage8, foodAndBeverage9, foodAndBeverage10,
                                foodAndBeverage11, foodAndBeverage12,
                                foodAndBeverage13, foodAndBeverage14, foodAndBeverage15, foodAndBeverage16,
                                foodAndBeverage17, foodAndBeverage18,
                                food19, food20, food21, food22, food23, food24,
                                fnb25, fnb26, fnb27, fnb28, fnb29, fnb30,
                                garment1, garment2, garment3, garment4, garment5, garment6,
                                garment7, garment8, garment9, garment10, garment11, garment12,
                                garment13, garment14, garment15, garment16, garment17, garment18,
                                garment19, garment20, garment21, garment22, garment23, garment24,
                                garment25, garment26, garment27, garment28, garment29, garment30,
                                materials1, materials2, materials3, materials4, materials5, materials6,
                                material7, material8, material9, material10, material11, material12,
                                material13, material14, material15, material16, material17, material18,
                                material19, material20, material21, material22, material23, material24,
                                material25, material26, material27, material28, material29, material30,
                                transportations1, transportations2, transportations3, transportations4,
                                transportations5, transportations6,
                                transportation7, transportations8, transportation9, transportations10, transportation11,
                                transportations12,
                                transportation13, transportation14, transportation15, transportation16,
                                transportation17, transportation18,
                                transport19, transport20, transport21, transport22, transport23, transport24,
                                transportation25, transportation26, transportation27, transportation28,
                                transportation29, transportation30,
                                tele1, tele2, tele3, tele4, tele5, tele6,
                                telecomunication7, telecomunication8, telecomunication9, telecomunication10,
                                telecomunication11, telecomunication12,
                                telecommunication13, telecommunication14, telecommunication15, telecommunication16,
                                telecommunication17, telecommunication18,
                                tele19, tele20, tele21, tele22, tele23, tele24,
                                telecommunication25, telecommunication26, telecommunication27, telecommunication28,
                                telecommunication29, telecommunication30));

                return listProduct;
        }
}