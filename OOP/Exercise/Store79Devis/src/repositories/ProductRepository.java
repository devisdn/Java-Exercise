package repositories;
import models.*;

public class ProductRepository {
    FoodAndBeverage food1 = new FoodAndBeverage("FD001","Food","Salt Cheese",5000.0,500,"FD001","13/09/2022","13/09/2023","terigu,telur,penyedap rasa,keju.","Halal MUI");
    FoodAndBeverage food2 = new FoodAndBeverage("OR01","Food","Oreo",4000.0,1000,"OR01","13/09/2021","13/12/2022","terigu,telur,gula,coklat,minyak palm.","Halal MUI");
    FoodAndBeverage food3 = new FoodAndBeverage("MSD01","Food","Mie Sedap Soto",2000.0,2000,"MSD01","13/09/2018","13/09/2024","Tepung terigu, minyak sayur, garam, pengental nabati, pengatur keasaman, pewarna (tartrazin CI 19140), dan zat besi.","Halal BPOM");
    FoodAndBeverage food4 = new FoodAndBeverage("DC01","Beverage","Susu Dancow UHT",20000.0,1000,"DC01","15/06/2022","15/12/2022","Susu sapi segar, sukrosa, susu bubuk skim, perisa identik alami, pengemulsi nabati (mengandung lesitin kedelai), premiks vitamin, 3 mineral.","Halal BPOM");
    FoodAndBeverage food5 = new FoodAndBeverage("PS01","Beverage","Pepsi",10000.0,500,"PS01","01/01/2022","01/01/2024","Carbonated water, sugar, acidity regulators (phosphoric acid, citric acid & sodium citrate), natural cola flavorings, caffeine, sodium benzoate preservative, arabic GOM stabilizer, food coloring (blue diamond Cl 42090 and allura red Cl 16035).","Halal MUI");
    FoodAndBeverage food6 = new FoodAndBeverage("UC01","Beverage","UC 1000 Vit C",4000.0,1500,"UC01","12/05/2018","13/05/2019","100% jus buah orange segar 7.2 mg, natrium klorida, kalsium laktat, magnesium klorida, kalium fosfat, fruktosa, gula, orange flavour, beta carotene, pengatur keasaman dan air hingga 500 ml.","Halal BPOM");

    FoodAndBeverage food7 = new FoodAndBeverage("T01", "Food", "Tango rasa Vanilla", 14000.0, 20, "11102022", "10102020", "11 Oktober 2022", "Tepung terigu, gula, lemak nabati, kakao bubuk, susu bubuk, pengemulsi lesitin kedelai, garam, tepung telur, pengembang natrium bikarbonat, kakao massa, vanillin", "MUI Halal" );
	FoodAndBeverage food8 = new FoodAndBeverage("T02", "Food", "Tango rasa rumput laut", 12000.0, 40, "05012023", "10 Januari 2021", "5 Januari 2023", "Tepung terigu, minyak nabati, tapioka, bumbu rasa rumput laut (mengandung penguat rasa mononatrium glutamat, dinatrium inosinat dan guanilat, rumput laut kering, perisa identik alami rumput laut, hidrolisat protein nabati, pewarna karamel kelas IE 150a), gula, garam, pengembang", "BPOM" );
	FoodAndBeverage food9 = new FoodAndBeverage("CH01", "Food", "Chitato rasa mie goreng", 18000.0, 15, "20112023", "10 Februari 2021", "20 November 2023", " kentang 63%, minyak olein kelapa sawit, bumbu rasa mi goreng kornet (mengandung maltodekstrin, gula, bawang putih bubuk, penguat rasa mononatrium glutamat, dinatrium ribonukleotida, pewarna karamel I dan karmin CI 75470, antioksidan alfa tokoferol), ekstrak daging sapi", "MUI Halal" );
	FoodAndBeverage food10 = new FoodAndBeverage("KG01", "Food", "Garuda Kacang Panggang Rosta Bawang 100G", 9000.0, 47, "18122024", "18 Desember 2020", "18 Desember 2024", "Kacang tanah, tepung terigu, pati termodifikasi, gula, minyak nabati, bumbu rasa bawang (mengandung penguat rasa mononatrium glutamat), garam, pengembang amonium bikarbonat antioksidan TBHQ", "BPOM" );
	FoodAndBeverage food11 = new FoodAndBeverage("T03", "Food", "Dua Kelinci Snack Krip Krip Tortilla Jagung Bakar 75G", 8000.0, 25, "19062023", "19 Juni 2020", "19 Juni 2023", "Jagung (65.61%), Minyak Sawit (mengandung Antioksidan TBHQ (E319)), Pati Jagung, Bumbu Jagung Bakar [mengandung Gula, Garam, Maltodekstrin, Padatan Susu, Glukosa, Protein Kedelai Terhidrolisis, Kecap Bubuk, Sayuran Bubuk", "MUI Halal" );
	FoodAndBeverage food12 = new FoodAndBeverage("CB01", "Food", "Chiki Snack Balls Chicken 200G", 22000.0, 16, "07082023", "07 Agustus 2020", "07 Agustus 2023", "Jagung, minyak olein kelapa sawit, beras, bumbu, garam, gula, penguat rasa mononatrium glutamat, dinatrium guanilat dan dinatrium inosinat, minyak dan lemak nabati, antioksidan asam askorbat, kedelai, minyak bawang", "BPOM" );

    FoodAndBeverage food13 = new FoodAndBeverage("BEVGIT", "FoodAndBeverage", "Thai Milk Tea", 5000.0, 480, "ICTGRT", "12 April 2022", "12 April 2023", "Milk", "Halal");
    FoodAndBeverage food14 = new FoodAndBeverage("FODBR", "FoodAndBeverage", "Babi Rica Rica", 80000.0, 5, "BBRCRC", "12 September 2022", "15 Sepetember 2022", "Pork", "Non Halal");
    FoodAndBeverage food15 = new FoodAndBeverage("FODDRT", "FoodAndBeverage", "Doritos Balado", 6500.0, 240, "DRTBLD", "14 Maret 2022", "14 Desember 2022", "Corn", "Halal");
    FoodAndBeverage food16 = new FoodAndBeverage("FODBNC", "FoodAndBeverage", "Bon Cabe Level 30", 7000.0, 100, "BNCL30", "11 Januari 2022", "30 Oktober 2022", "Chili", "Halal");
    FoodAndBeverage food17 = new FoodAndBeverage("BEVLTM", "FoodAndBeverage", "Lactamil Pregnasis", 90000.0, 7, "LTMPRG", "20 Agustus 2022", "20 Agustus 2024", "Milk", "Halal");
    FoodAndBeverage foodA18 = new FoodAndBeverage("BEVVSO", "FoodAndBeverage", "V-Soy Susu Kedelai", 5000.0, 150, "VSYSKD", "14 Agustus 2022", "14 Agustus 2023", "soy milk", "Halal");

    FoodAndBeverage food19 = new FoodAndBeverage("F0019", "Food", "Chocodot Mini", 5000.0, 200, "PF019", "13 September 2022", "13 Maret 2023", "Cokelat, Dodol", "Halal MUI");
    FoodAndBeverage food20 = new FoodAndBeverage("F0020", "Food", "Baso Aci Boci", 17000.0, 300, "PF020", "13 September 2022", "13 Desember 2022", "Tepung tapioka, Tepung terigu, Garam", "Halal MUI");
    FoodAndBeverage food21 = new FoodAndBeverage("F0021", "Food", "Mie Instant Ramen Gorilla", 13000.0, 450, "PF021", "13 September 2022", "13 Desember 2022", "Tepung terigu, Garam, Sodium bikarbonat, Minyak Goreng", "Halal MUI");
    FoodAndBeverage food22 = new FoodAndBeverage("B0022", "Beverage", "Aqua Botol 600 ml", 3000.0, 150, "PF022", "13 September 2022", "13 September 2024", "Air Mineral", "Halal BPOM");
    FoodAndBeverage food23 = new FoodAndBeverage("B0023", "Beverage", "Goodday Funtastic Moccacino 250 ml", 7000.0, 1000, "PF023", "13 September 2022", "13 September 2023", "Air, Gula, Krimer nabati, Kopi, Susu skim bubuk, Bubuk kakao", "Halal BPOM");
    FoodAndBeverage food24 = new FoodAndBeverage("B0024", "Beverage", "Nu Milk Tea 330 ml", 6700.0, 500, "PF024", "13 September 2022", "13 September 2023", "Air, Daun teh, Gula, Susu bubuk, Nabati", "Halal BPOM");

    FoodAndBeverage food25 = new FoodAndBeverage("TP0001", "Food and Beverages", "Teh Poci", 2000.0, 50, "TP0001", "13 September 2022", "1 Januari 2023", "Air, Gula, Daun Teh Kering, Es", "MUI Halal");
    FoodAndBeverage food26 = new FoodAndBeverage("UM0001", "Food and Beverages", "Ultra Milk Coklat", 4000.0, 72, "UM0001", "12 September 2022", "1 Juni 2023", "Susu, Gula, Perasa Buah", "MUI Halal");
    FoodAndBeverage food27 = new FoodAndBeverage("CT0001", "Food and Beverages", "Chitato Rumput Laut", 5000.0, 72, "CT0001", "29 Agustus 2022", "5 September 2023", "Kentang, Garam, Bubuk Lada", "MUI Halal");
    FoodAndBeverage food28 = new FoodAndBeverage("AM0001", "Food and Beverages", "Jamu Kemasan Botol", 50000.0, 24, "AM0001", "12 September 2022", "12 September 2023", "Alkohol 5%, Air, Perasa Anggur", "Food Certified");
    FoodAndBeverage food29 = new FoodAndBeverage("SR0001", "Food and Beverages", "Sari Roti Tawar", 12000.0, 24, "SR0001", "12 September 2022", "17 September 2022", "Terigu, Susu, Telur", "MUI Halal");
    FoodAndBeverage food30 = new FoodAndBeverage("IM0001", "Food and Beverages", "Indomie Ayam Geprek", 2500.0, 36, "IN0001", "20 September 2022", "30 Agustus 2022", "Terigu, Telur, Minyak Nabati", "MUI Halal");

    Garment garment1 = new Garment("CHB01","Baju","Baju Tidur Bayi",35000.0,36,"CHB01","05/10/2022","Baju Tidur","Garut Kids Cloth","Biru Muda",4,"Bayi");
    Garment garment2 = new Garment("CHD02","Baju","Baju Kaos Dewasa",100000.0,150,"CHD02","05/10/2023","Baju Kaos","Bazoka Cloth","Red",9,"Dewasa");
    Garment garment3 = new Garment("GN01","Baju","Baju Gamis Wanita dengan Hijab",150000.0,20,"GN01","05/03/2022","Baju Gamis","Amanah Cloth","Pink",8,"Dewasa");
    Garment garment4 = new Garment("JKT01","Jaket","Jaket Muslim Wanita",250000.0,100,"JKT01","05/10/2022","Jaket Muslimah","Hijacket","Hijau",8,"Dewasa");
    Garment garment5 = new Garment("SPT01","Sepatu","Sepatu Kulit Pria",180000.0,50,"SPT01","05/09/2022","Sepatu Kulit","Sukaregang Leather","Hitam",40,"Dewasa");
    Garment garment6 = new Garment("SDL01","Sandal","Sandal Kulit Wanita",35000.0,70,"SDL01","01/01/2022","Sandal Kulit","Sukaregang Leather","Biru Muda",38,"Dewasa");

    Garment garment7 = new Garment("K01", "Kemeja Pria", "kemeja Kantor", 140000.0, 100, "H0119", "11 Agustus 2021", "Kemeja panjang", "H&M", "Hitam", 32, "Dewasa");
    Garment garment8 = new Garment("J01", "Jaket pria", "jaket Zara Original", 1500000.0, 15, "Z0211", "11 Agustus 2019", "Jaket", "Zara", "Hitam", 33, "Dewasa");
    Garment garment9 = new Garment("CJ01", "Celana Jeans", "Celana Panjang Jeans Denim Pria Bleach", 199000.0, 30, "C1164", "11 Agustus 2020", "Celana panjang", "Levi's", "Hitam", 29, "Dewasa");
    Garment garment10 = new Garment("SW01", "Sweater wanita", "Sweater Nevada Polos cewe original", 99000.0, 200, "N0382", "11 September 2020", "Sweater", "Nevada", "Biru, Kuning, Putih", 27-33, "Dewasa");
    Garment garment11 = new Garment("BL01", "Blouse", "blouse navy polkadot", 140000.0, 1000, "B0119", "11 Desember 2022", "Kemeja", "Barybenka", "Biru", 25-39, "Dewasa");
    Garment garment12 = new Garment("B01", "baju", "Baju Anak-anak", 100000.0, 1000, "B0119", "13 Oktober 2021", "baju Anak-anak", "H&M", "Hitam, biru, kuning, merah", 12-18, "Anak-anak");

    Garment garment13 = new Garment("GRMPLO", "Garment", "polo raphralurent White", 300000.0, 48, "PLORPW", "14 February 2022", "Polo Shirt", "Kahatex", "White", 42, "Dewasa");
    Garment garment14 = new Garment("GRMSTI", "Garment", "STONE ISLAND GD BRUSHED COTTON ZIP", 4000000.0, 12, "STIGDB", "15 April 2018", "ZIP", "Pou Yen", "Black", 44, "Dewasa");
    Garment garment15 = new Garment("GRMFLA", "Garment", "Fila Expo 2", 700000.0, 48, "FLAXPO", "15 April 2015", "Outwear", "Perdana", "Blue Navy", 42, "Dewasa");
    Garment garment16 = new Garment("GRMCPC", "Garment", "CP Company Goole", 2000000.0, 100, "CPCGOG", "19 Agustus 2021", "Outwear", "Jim Myoung", "Black", 43, "Lansia");
    Garment garment17 = new Garment("GRMDRS", "Garment", "Vero moda Earty", 800000.0, 12, "DRSVRO", "15 Agustus 2022", "Dress", "Kahatex", "Yellow", 34, "Anak - anak");
    Garment garment18 = new Garment("GRMJNS", "Garment", "Uniqlo Denim Black", 300000.0, 400, "UNQDBL", "20 Agustus 2022", "Denim", "Yolita", "Black", 42, "Dewasa");

    Garment garment19 = new Garment("G0019", "Kaos", "Kaos Java Code", 80000.0, 150, "PG019", "13 September 2022", "V-Neck", "Cotton combed 30s", "Hitam", 30, "Dewasa");
    Garment garment20 = new Garment("G0020", "Kaos", "Kaos Screamous", 50000.0, 250, "PG020", "13 September 2022", "Raglan", "Cotton combed 20s", "Hitam Abu", 34, "Dewasa");
    Garment garment21 = new Garment("G0021", "Jaket", "Jacket Jeans", 250000.0, 30, "PG021", "13 September 2022", "Trucker", "Jeans", "Biru", 40, "Dewasa");
    Garment garment22 = new Garment("G0022", "Jaket", "Jaket Squish TPkids", 150000.0, 200, "PG022", "13 September 2022", "Bomber", "Fleece", "Navy", 14, "Bayi");
    Garment garment23 = new Garment("G0023", "Kemeja", "Kemeja Polos", 120000.0, 500, "PG023", "13 September 2022", "Formal", "Flanel", "White", 30, "Dewasa");
    Garment garment24 = new Garment("G0024", "Kemeja", "Kemeja Polos Anak", 100000.0, 150, "PG024", "13 September 2022", "Formal", "Flanel", "Hitam", 24, "Anak");

    Garment garment25 = new Garment("HM0001", "Garment", "HnM Sky Black Long Pants", 100000.0, 20, "J0023", "10 September 2022", "Long Pants", "Jeans", "Black", 42, "Dewasa");
    Garment garment26 = new Garment("HM0002", "Garment", "HnM Jet Blue TShirt", 150000.0, 20, "J0059", "20 Oktober 2022", "TShirt", "Cotton", "Blue", 36, "Remaja");
    Garment garment27 = new Garment("BT0001", "Garment", "Bata Super Yellow Pair Shoes", 200000.0, 20, "A0043", "1 Desember 2021", "Shoes", "Leather", "Brown-Yellow", 42, "Dewasa");
    Garment garment28 = new Garment("HP0001", "Garment", "HommyPed Kiddie Flash Shoes", 100000.0, 20, "B0023", "1 Desember 2021", "Shoes", "Nylon Mesh", "Grey", 28, "Anak");
    Garment garment29 = new Garment("HP0002", "Garment", "HommyPed Sleep Suit", 50000.0, 20, "B0033", "1 Desember 2021", "Shirt", "Cotton", "White", 15, "Baby");
    Garment garment30 = new Garment("NK0001", "Garment", "Nike Air Jordan", 2000000.0, 5, "N0001", "1 Januari 2022", "Shoes", "Leather", "Red White", 42, "Dewasa");

    Material material1 = new Material("BT01","Materials","Batu Bata",500.0,100000,"BT01","04/05/2022","none","Bahan Bangunan",false);
    Material material2 = new Material("KT01","Materials","Kulit Sapi",200000.0,100,"KT01","04/09/2022","04/04/2023","Bahan Garment",false);
    Material material3 = new Material("CS01","Materials","Keju Cheddar",7000.0,200,"CS01","04/05/2021","04/05/2022","Bahan Makanan",true);
    Material material4 = new Material("SG01","Materials","Gula Pasir",20000.0,100,"SG01","10/01/2022","10/01/2023","Bahan Makanan",true);
    Material material5 = new Material("TG01","Materials","Terigu",15000.0,500,"TG01","04/07/2021","04/11/2022","Bahan Makanan",true);
    Material material6 = new Material("AC01","Materials","Air Accu",5000.0,300,"AC01","04/05/2022","04/05/2024","Bahan Kimia",false);

    Material material7 = new Material("M01", "Materials", "Besi", 20000.0, 10000, "B111220010", "11/8/2021", "none", "Bahan Bangunan", false);
    Material material8 = new Material("S01", "Materials", "Sendok", 2000.0, 10000, "S120920019", "07/9/2020", "none", "Alat Makan", false);
    Material material9 = new Material("GJ01", "Materials", "Gula jawa", 12000.0, 70, "GJ091120021", "09/11/2021", "09/11/2022", "Bahan Makanan", true);
    Material material10 = new Material("G01", "Materials", "Garam", 8000.0, 9000, "G100120021", "10/01/2021", "10/01/2030", "Bahan Masakan", true);
    Material material11 = new Material("CT01", "Materials", "Cat Tembok", 40000.0, 100, "CT050620020", "05/06/2020", "05/06/2025", "Bahan Bangunan", false);
    Material material12 = new Material("G01", "Materials", "Garpu", 2000.0, 10000, "G130220009", "13/02/2009", "none", "Alat Makan", false);

    Material material13 = new Material("MTRGLT", "Material", "beef gelatin", 140000.0, 10000, "GLTBEF", "17 agustus 2022", "17 agustus 2024", "collagen extraction", true);
    Material material14 = new Material("MTRSSN", "Material", "Pink Sea Sand", 50000.0, 10000, "PNKSSN", "20 April 2022", "20 April 2025", "Sand", false);
    Material material15 = new Material("MTRTWD", "Material", "Jepara Teak Wood", 1000000.0, 180, "JPRTWD", "2 September 2022", "2 September 2026", "Building Material", false);
    Material material16 = new Material("MTRBTR", "Material", "Black Truffle Mushroom", 40000.0, 16, "MHRBTR", "11 Mei 2022", "11 Mei 2023", "Food Material", true);
    Material material17 = new Material("MTRVLN", "Material", "Tidy Vinyl", 700000.0, 900, "TDVYL", "20 Agustus 2022", "20 Agustus 2026", "Wood", false);
    Material material18 = new Material("MTRCTN", "Material", "Supernova Cotton Fabric", 200000.0, 10000, "SPNCTN", "7 Desember 2021", "7 Desember 2027", "cotton fiber", false);

    Material material19 = new Material("M0019", "Bahan Makanan", "Wijsman Butter 250 g", 120000.0, 100, "PM019", "13 September 2022", "13 September 2023", "Mentega", true);
    Material material20 = new Material("M0020", "Bahan Makanan", "Himalaya Black Truffle", 4880000.0, 400, "PM020", "13 September 2022", "13 September 2023", "Jamur", true);
    Material material21 = new Material("M0021", "Bahan Makanan", "Caviar Beluga 300 gr", 29000000.0, 160, "PM021", "13 September 2022", "13 September 2023", "Telur", true);
    Material material22 = new Material("M0022", "Bahan Makanan", "Wasabi Pasta 43 gr", 60000.0, 200, "PM022", "13 September 2022", "13 September 2023", "Wasabi", true);
    Material material23 = new Material("M0023", "Bahan Bangunan", "Semen Tiga Roda 50 kg", 72500.0, 1000, "PM023", "13 September 2022", "-", "Semen", false);
    Material material24 = new Material("M0024", "Bahan Bangunan", "Nippon Paint Blue 1 kg", 69900.0, 300, "PM024", "13 September 2022", "-", "Cat", false);

    Material material25 = new Material("SN0001", "Material", "Pasir Putih", 1500000.0, 21, "P0001", "1 Januari 2022", "1 Januari 2032", "Bahan Bangunan", false);
    Material material26 = new Material("SN0002", "Material", "Pasir Hitam", 1600000.0, 21, "P0002", "1 Januari 2022", "1 Januari 2032", "Bahan Bangunan", false);
    Material material27 = new Material("DP0001", "Material", "Citric Acid", 5000.0, 75, "C0003", "1 Januari 2022", "1 Januari 2023", "Bahan Dapur", true);
    Material material28 = new Material("DP0002", "Material", "Sucrose", 30000.0, 75, "C0003", "1 Januari 2022", "1 Januari 2023", "Bahan Dapur", true);
    Material material29 = new Material("BK0001", "Material", "Hidrogen Chlorida", 36000.0, 25, "K0001", "1 Januari 2022", "1 Januari 2023", "Bahan Kimia", false);
    Material material30 = new Material("BK0002", "Material", "Dihidrogen Monoksida", 5000.0, 25, "K0002", "1 Januari 2022", "TBA", "Bahan Kimia", true);

    Transportation transport1 = new Transportation("OJK01","Services","Ojek Pangkalan",5000.0,20,"fixperroute","Sepeda Motor","Karangpawitan-Suci");
    Transportation transport2 = new Transportation("DL01","Services","Delman",15000.0,50,"fixperroute","Kereta Kuda","Karangpawitan-Wanaraja");
    Transportation transport3 = new Transportation("OGB01","Services","Ojek Grab",5000.0,100,"permiles","Sepeda Motor",5.0);
    Transportation transport4 = new Transportation("ID01","Services","Ojek InDriver",4000.0,75,"permiles","Sepeda Motor",10.0);
    Transportation transport5 = new Transportation("PST01","Services","Pesawat Terbang Garuda Indonesia",1000000.0,20,"fixperroute","Pesawat Terbang","Jakarta - Bali");
    Transportation transport6 = new Transportation("KPL01","Services","Kapal Feri Pesona Indonesia",150000.0,10,"fixperroute","Kapal Laut","Pelabuhan Merak - Bakauheni");

    Transportation transport7 = new Transportation("AKT01", "Transportasi Umum", "Angkutan Umum", 5000.0, 20, "fixperroute", "Angkutan umum", "pasar Wage - Purwokerto Alun-alun" );
    Transportation transport8 = new Transportation("KPL01","Transportasi Umum","Garuda Indonesia",350000.0,10,"fixperroute","Pesawat Terbang","Jakarta-Malaysia");
    Transportation transport9 = new Transportation("GC01", "Transportasi Umum", "Grab Car", 20000.0, 20, "perMiles", "Mobil", 3.0 );
    Transportation transport10 = new Transportation("GJK01","Transportasi Umum", "Gojek", 10000.0, 10, "perMiles", "Motor", 3.0);
    Transportation transport11 = new Transportation("AKT01", "Transportasi Umum", "Kereta Api Indonesia", 150000.0, 100, "fixperroute", "Kereta Api", "Purwokerto - Jogjakarta" );
    Transportation transport12 = new Transportation("KPL01","Transportasi Umum","Bus Sinar jaya",130000.0, 30,"fixperroute","Bus","Jogjakarta - Jakarta");

    Transportation transport13 = new Transportation("TRSTMB", "Transportation", "Trans Metro Bandung", 10000.0, 50, "fixperroute", "Bus", "Cimindi - Gatsu");
    Transportation transport14 = new Transportation("TRSTKG", "Transportation", "Tongkang Cirata", 15000.0, 20, "fixperroute", "Boot", "Cirata - Saguling");
    Transportation transport15 = new Transportation("TRSTEB", "Transportation", "Teman Bus", 5000.0, 60, "fixperroute", "Bus", "Kota Baru - Alun Alun Bandung");
    Transportation transport16 = new Transportation("TRSKCI", "Transportation", "Kereta Cepat Jakarta - Bandung", 300000.0, 500, "fixperroute", "Train", "Jakarta - Bandung");
    Transportation transport17 = new Transportation("TRSBJJ", "Transportation", "Bajaj Batujajar", 4000.0, 2, "permiles", "motorcycle", 10.0);
    Transportation transport18 = new Transportation("TRSMNR", "Transportation", "Monorel Dago", 11000.0, 30, "permiles", "Train", 7.1);

    Transportation transport19 = new Transportation("TR019", "Transport", "Uber", 20000.0, 1000, "permiles", "Car", 10.0 );
    Transportation transport20 = new Transportation("TR020", "Transport", "Jajap Garut", 10000.0, 100, "permiles", "Bike", 5.0 );
    Transportation transport21 = new Transportation("TR021", "Transport", "Anterin", 8000.0, 200, "permiles", "Bike", 4.0 );
    Transportation transport22 = new Transportation("TR022", "Transport", "Shinkansen", 200000.0, 1000, "fixperroute", "Train", "Garut - Yogyakarta");
    Transportation transport23 = new Transportation("TR023", "Transport", "Bitcar", 100000.0, 500, "fixperroute", "Car", "Jakarta");
    Transportation transport24 = new Transportation("TR024", "Transport", "Bojek", 20000.0, 70, "fixperroute", "Bike", "Bogor");

    Transportation transport25 = new Transportation("RS0001", "Transportation", "Bis Malam Rosalia Indah", 250000.0, 1, "FixPerRoute", "Bus", "Jakarta-Yogyakarta");
    Transportation transport26 = new Transportation("MG0001", "Transportation", "Bis MGI", 75000.0, 201, "FixPerRoute", "Bus", "Leuwiliang-Bandung");
    Transportation transport27 = new Transportation("GR0001", "Transportation", "Grab Bike", 8000.0, 301, "PerMiles", "Motorbike", 3.5);
    Transportation transport28 = new Transportation("GJ0001", "Transportation", "Gojek Ride", 2300.0, 1, "PerMiles", "Motorbike", 1.5);
    Transportation transport29 = new Transportation("TR0001", "Transportation", "Travel Agent 001", 150000.0, 2, "FixPerRoute", "MiniBus", "Bogor-Bandung");
    Transportation transport30 = new Transportation("TX0001", "Transportation", "Taxi BlueBird", 4100.0, 3, "PerMiles", "Taxi", 2.2);

    Telecommunication tele1 = new Telecommunication("IDH01","services","Indihome",300000.0,500,"per paket","Default","20 Mbps",30);
    Telecommunication tele2 = new Telecommunication("BZN01","services","BizzNet",200000.0,100,"per paket","Default","30 Mbps",30);
    Telecommunication tele3 = new Telecommunication("THR01","services","Paket Home 117 GB Three",117000.0,10,"per paket","Data","15 Mbps",30);
    Telecommunication tele4 = new Telecommunication("BYU01","services","Internet Murah By U",150000.0,50,"per peket","Data","30 Mbps",30);
    Telecommunication tele5 = new Telecommunication("IND01","services","Indosat",10000.0,500,"per second","Default","50 Mbps",3);
    Telecommunication tele6 = new Telecommunication("XL01","services","XL Seharian Social Media",5000.0,40,"per paket","Default","30 Mbps",1);

    Telecommunication tele7 = new Telecommunication("B01","Providers","BizzNet", 180000.0, 100, "per paket", "Default", "30 Mbps",30);
    Telecommunication tele8 = new Telecommunication("INH01", "Providers", "Indihome", 260000.0, 100, "per paket", "Default", "25 Mbps",30);
    Telecommunication tele9 = new Telecommunication("XL01", "Providers", "XL", 60000.0, 30, "per paket", "Default", "25 Mbps",30);
    Telecommunication tele10 = new Telecommunication("S01", "Providers", "Simpati", 100000.0, 40, "per paket", "Default", "30 Mbps",30);
    Telecommunication tele11 = new Telecommunication("INH01", "Providers", "Indoosat", 70000.0, 50, "per paket", "Default", "25 Mbps",30);
    Telecommunication tele12 = new Telecommunication("INH01", "Providers", "3", 70000.0, 30, "per paket", "Default", "25 Mbps",30);

    Telecommunication tele13 = new Telecommunication("TLCTSK", "Telecommunication", "Telkomsel sakti 80GB", 80000.0, 1000, "PerPacket", "data", "80 GB", 30);
    Telecommunication tele14 = new Telecommunication("TLCPKB", "Telecommunication", "Telkomsel Paket Bicara All operator", 100000.0, 100, "PerPacket", "data", "Sepuasnya", 30);
    Telecommunication tele15 = new Telecommunication("TLCVDO", "Telecommunication", "Video Diamond Mobile", 60000.0, 100, "PerPacket", "data", "1000 GB", 30);
    Telecommunication tele16 = new Telecommunication("TLCPDT", "Telecommunication", "Paket Darurat Telpon", 10000.0, 100, "PerSecond", "Default", "120 Menit", 1);
    Telecommunication tele17 = new Telecommunication("TLCPDI", "Telecommunication", "Paket Darurat Internet", 15000.0, 150, "PerSecond", "Default", "1.5 GB", 1);
    Telecommunication tele18 = new Telecommunication("TLCIDP", "Telecommunication", "ID Plat 4 Bulan + 2 Bulan", 1000000.0, 5, "per paket", "Default", "Unlimited", 180);

    Telecommunication tele19 = new Telecommunication("TE019", "Telecommunication", "Paket OMG Telkomsel 17 GB", 100000.0, 500, "perpacket", "data", "100 Mbps", 30);
    Telecommunication tele20 = new Telecommunication("TE020", "Telecommunication", "Paket OMG Telkomsel 32 GB", 150000.0, 200, "perpacket", "data", "70 Mbps", 30);
    Telecommunication tele21 = new Telecommunication("TE021", "Telecommunication", "Paket OMG Telkomsel 37 GB", 182000.0, 100, "perpacket", "data", "60 Mbps", 30);
    Telecommunication tele22 = new Telecommunication("TE022", "Telecommunication", "Paket HOTPROMO Telkomsel 80 GB", 155000.0, 100, "perpacket", "default", "100 Mbps", 30);
    Telecommunication tele23 = new Telecommunication("TE023", "Telecommunication", "Paket HOTPROMO Telkomsel 500 MB", 5000.0, 500, "perpacket", "default", "50 Mbps", 1);
    Telecommunication tele24 = new Telecommunication("TE024", "Telecommunication", "Paket HOTPROMO Telkomsel 120 GB", 210000.0, 50, "perpacket", "default", "100 Mbps", 30);
    
    Telecommunication tele25 = new Telecommunication("VD0001", "Telecommunication", "Vodafone", 220000.0, 5, "PerPacket", "Data", "150 Mbps", 30);
    Telecommunication tele26 = new Telecommunication("ST0001", "Telecommunication", "Singapore Telecommunications", 200000.0, 6, "PerSecond", "Default", "100 Mbps", 20);
    Telecommunication tele27 = new Telecommunication("TM0001", "Telecommunication", "T-Mobile", 150000.0, 6, "PerPacket", "Default", "200 Mbps", 30);
    Telecommunication tele28 = new Telecommunication("CC0001", "Telecommunication", "Comcast", 125000.0, 5, "PerPacket", "Data", "500 Mbps", 30);
    Telecommunication tele29 = new Telecommunication("SP0001", "Telecommunication", "Spectrum", 100000.0, 201, "PerSecond", "Default", "200 Mbps", 30);
    Telecommunication tele30 = new Telecommunication("VZ0001", "Telecommunication", "Verizon", 175000.0, 202, "PerSecond", "Default", "50 Mbps", 30);
}
