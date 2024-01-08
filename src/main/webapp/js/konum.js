
var locations = {
    "Adana": ["Aladağ", "Ceyhan", "Çukurova", "Feke", "İmamoğlu", "Karaisalı", "Karataş", "Kozan", "Pozantı", "Saimbeyli", "Sarıçam", "Seyhan", "Tufanbeyli", "Yumurtalık"],
    "Adıyaman": ["Besni", "Çelikhan", "Gerger", "Gölbaşı", "Kahta", "Merkez", "Samsat", "Sincik", "Tut"],
    "Afyonkarahisar": ["Başmakçı", "Bayat", "Bolvadin", "Çay", "Çobanlar", "Dazkırı", "Dinar", "Emirdağ", "Evciler", "Hocalar", "İhsaniye", "İscehisar", "Kızılören", "Sandıklı", "Sinanpaşa", "Sultandağı", "Şuhut"],
    "AĞRI 		  "	:["Ağrı", "Diyadin", "Doğubeyazıt", "Eleşkirt", "Hamur", "Patnos", "Taşlıçay", "Tutak"],
    "AMASYA		  "	:["Amasya", "Göynücek", "Gümüşhacıköy", "Hamamözü", "Merzifon", "Suluova", "Taşova"],
    "ANKARA		  "	:["Akyurt", "Altındağ", "Ayaş", "Bala", "Beypazarı", "Çamlıdere", "Çankaya", "Çubuk", "Elmadağ", "Etimesgut", "Evren", "Gölbaşı", "Güdül", "Haymana", "Kalecik", "Kazan", "Keçiören", "Kızılcahamam", "Mamak", "Nallıhan", "Polatlı", "Pursaklar", "Sincan", "Şereflikoçhisar", "Yenimahalle"],
    "ANTALYA	  "	:["Akseki", "Aksu", "Alanya", "Döşemealtı", "Elmalı", "Finike", "Gazipaşa", "Gündoğmuş", "İbradi", "Kale", "Kaş", "Kemer", "Kepez", "Konyaaltı", "Korkuteli", "Kumluca", "Manavgat", "Muratpaşa", "Serik"],
    "ARTVİN		  "	:["Ardanuç", "Arhavi", "Artvin", "Borçka", "Hopa", "Murgul", "Şavşat", "Yusufeli"],
    "AYDIN		  "	:["Aydın", "Bozdoğan", "Buharkent", "Çine", "Didim", "Germencik", "İncirliova", "Karacasu", "Karpuzlu", "Koçarlı", "Köşk", "Kuşadası", "Kuyucak", "Nazilli", "Söke", "Sultanhisar", "Yenipazar"],
    "BALIKESİR	  "	:["Ayvalık", "Balıkesir", "Balya", "Bandırma", "Bigadiç", "Burhaniye", "Dursunbey", "Edremit", "Erdek", "Gömeç", "Gönen", "Havran", "İvrindi", "Kepsut", "Manyas", "Marmara", "Savaştepe", "Sındırgı", "Susurluk"],
    "BİLECİK	  "	:["Bilecik", "Bozüyük", "Gölpazarı", "İnhisar", "Osmaneli", "Pazaryeri", "Söğüt", "Yenipazar"],
    "BİNGÖL		  "	:["Adaklı", "Bingöl", "Genç", "Karlıova", "Kiğı", "Solhan", "Yayladere", "Yedisu"],
    "BİTLİS		  "	:["Adilcevaz", "Ahlat", "Bitlis", "Güroymak", "Hizan", "Mutki", "Tatvan"],
    "BOLU		  "	:["Bolu", "Dörtdivan", "Gerede", "Göynük", "Kıbrıscık", "Mengen", "Mudurnu", "Seben", "Yeniçağa"],
    "BURDUR		  "	:["Ağlasun", "Altınyayla", "Bucak", "Burdur", "Çavdır", "Çeltikçi", "Gölhisar", "Karamanlı", "Kemer", "Tefenni", "Yeşilova"],
    "BURSA		  "	:["Büyükorhan", "Gemlik", "Gürsu", "Harmancık", "İnegöl", "İznik", "Karacabey", "Keles", "Kestel", "Mudanya", "Mustafakemalpaşa", "Nilüfer", "Orhaneli", "Orhangazi", "Osmangazi", "Yenişehir", "Yıldırım"],
    "ÇANAKKALE	  "	:["Ayvacık", "Bayramiç", "Biga", "Bozcaada", "Çan", "Çanakkale", "Eceabat", "Ezine", "Gelibolu", "Gökçeada", "Lapseki", "Yenice"],
    "ÇANKIRI	  "	:["Atkaracalar", "Bayramören", "Çankırı", "Çerkeş", "Eldivan", "Ilgaz", "Kızılırmak", "Korgun", "Kurşunlu", "Orta", "Şabanözü", "Yapraklı"],
    "ÇORUM		  "	:["Alaca", "Bayat", "Boğazkale", "Çorum", "Dodurga", "İskilip", "Kargı", "Laçin", "Mecitözü", "Oğuzlar", "Ortaköy", "Osmancık", "Sungurlu", "Uğurludağ"],
    "DENİZLİ	  "	:["Acıpayam", "Akköy", "Babadağ", "Baklan", "Bekilli", "Beyağaç", "Bozkurt", "Buldan", "Çal", "Çameli", "Çardak", "Çivril", "Denizli", "Güney", "Honaz", "Kale", "Sarayköy", "Serinhisar", "Tavas"],
    "DİYARBAKIR	  "	:["Bağlar", "Bismil", "Çermik", "Çınar", "Çüngüş", "Dicle", "Eğil", "Ergani", "Hani", "Hazro", "Kayapınar", "Kocaköy", "Kulp", "Lice", "Silvan", "Sur", "Yenişehir"],
    "EDİRNE		  "	:["Edirne", "Enez", "Havsa", "İpsala", "Keşan", "Lalapaşa", "Meriç", "Süloğlu", "Uzunköprü"],
    "ELAZIĞ		  "	:["Ağın", "Alacakaya", "Arıcak", "Baskil", "Elazığ", "Karakoçan", "Keban", "Kovancılar", "Maden", "Palu", "Sivrice"],
    "ERZİNCAN	  "	:["Çayırlı", "Erzincan", "İliç", "Kemah", "Kemaliye", "Otlukbeli", "Refahiye", "Tercan", "Üzümlü"],
    "ERZURUM	  "	:["Aşkale", "Aziziye", "Çat", "Hınıs", "Horasan", "İspir", "Karaçoban", "Karayazı", "Köprüköy", "Narman", "Oltu", "Olur", "Palandöken", "Pasinler", "Pazaryolu", "Şenkaya", "Tekman", "Tortum", "Uzundere", "Yakutiye"],
    "ESKİŞEHİR	  "	:["Alpu", "Beylikova", "Çifteler", "Günyüzü", "Han", "İnönü", "Mahmudiye", "Mihalgazi", "Mihalıççık", "Odunpazarı", "Sarıcakaya", "Seyitgazi", "Sivrihisar", "Tepebaşı"],
    "GAZİANTEP	  "	:["Araban", "İslahiye", "Karkamış", "Nizip", "Nurdağı", "Oğuzeli", "Şahinbey", "Şehitkamil", "Yavuzeli"],
    "GİRESUN	  "	:["Alucra", "Bulancak", "Çamoluk", "Çanakçı", "Dereli", "Doğankent", "Espiye", "Eynesil", "Giresun", "Görele", "Güce", "Keşap", "Piraziz", "Şebinkarahisar", "Tirebolu", "Yağlıdere"],
    "GÜMÜŞHANE	  "	:["Gümüşhane", "Kelkit", "Köse", "Kürtün", "Şiran", "Torul"],
    "HAKKARİ	  "	:["Çukurca", "Hakkâri", "Şemdinli", "Yüksekova"],
    "HATAY		  "	:["Altınözü", "Antakya", "Belen", "Dörtyol", "Erzin", "Hassa", "İskenderun", "Kırıkhan", "Kumlu", "Reyhanlı", "Samandağ", "Yayladağı"],
    "ISPARTA	  "	:["Aksu", "Atabey", "Eğirdir", "Gelendost", "Gönen", "Isparta", "Keçiborlu", "Senirkent", "Sütçüler", "Şarkikaraağaç", "Uluborlu", "Yalvaç", "Yenişarbademli"],
    "İÇEL		  "	:["Akdeniz", "Anamur", "Aydıncık", "Bozyazı", "Çamlıyayla", "Erdemli", "Gülnar", "Mezitli", "Mut", "Silifke", "Tarsus", "Toroslar", "Yenişehir"],
    "İSTANBUL	  "	:["Adalar", "Arnavutköy", "Ataşehir", "Avcılar", "Bağcılar", "Bahçelievler", "Bakırköy", "Başakşehir", "Bayrampaşa", "Beşiktaş", "Beykoz", "Beylikdüzü", "Beyoğlu", "Büyükçekmece", "Çatalca", "Çekmeköy", "Esenler", "Esenyurt", "Eyüp", "Fatih", "Gaziosmanpaşa", "Güngören", "Kadıköy", "Kağıthane", "Kartal", "Küçükçekmece", "Maltepe", "Pendik", "Sancaktepe", "Sarıyer", "Silivri", "Sultanbeyli", "Sultangazi", "Şile", "Şişli", "Tuzla", "Ümraniye", "Üsküdar", "Zeytinburnu"],
    "İZMİR		  "	:["Aliağa", "Balçova", "Bayındır", "Bayraklı", "Bergama", "Beydağ", "Bornova", "Buca", "Çeşme", "Çiğli", "Dikili", "Foça", "Gaziemir", "Güzelbahçe", "Karabağlar", "Karaburun", "Karşıyaka", "Kemalpaşa", "Kınık", "Kiraz", "Konak", "Menderes", "Menemen", "Narlıdere", "Ödemiş", "Seferihisar", "Selçuk", "Tire", "Torbalı", "Urla"],
    "KARS		  "	:["Akyaka", "Arpaçay", "Digor", "Kağızman", "Kars", "Sarıkamış", "Selim", "Susuz"],
    "KASTAMONU	  "	:["Abana", "Ağlı", "Araç", "Azdavay", "Bozkurt", "Cide", "Çatalzeytin", "Daday", "Devrekani", "Doğanyurt", "Hanönü", "İhsangazi", "İnebolu", "Kastamonu", "Küre", "Pınarbaşı", "Seydiler", "Şenpazar", "Taşköprü", "Tosya"],
    "KAYSERİ	  "	:["Akkışla", "Bünyan", "Develi", "Felahiye", "Hacılar", "İncesu", "Kocasinan", "Melikgazi", "Özvatan", "Pınarbaşı", "Sarıoğlan", "Sarız", "Talas", "Tomarza", "Yahyalı", "Yeşilhisar"],
    "KIRKLARELİ	  "	:["Babaeski", "Demirköy", "Kırklareli", "Kofçaz", "Lüleburgaz", "Pehlivanköy", "Pınarhisar", "Vize"],
    "KIRŞEHİR	  "	:["Akçakent", "Akpınar", "Boztepe", "Çiçekdağı", "Kaman", "Kırşehir", "Mucur"],
    "KOCAELİ	  "	:["Başiskele", "Çayırova", "Darıca", "Derince", "Dilovası", "Gebze", "Gölcük", "İzmit", "Kandıra", "Karamürsel", "Kartepe", "Körfez"],
    "KONYA		  "	:["Ahırlı", "Akören", "Akşehir", "Altınekin", "Beyşehir", "Bozkır", "Cihanbeyli", "Çeltik", "Çumra", "Derbent", "Derebucak", "Doğanhisar", "Emirgazi", "Ereğli", "Güneysınır", "Hadım", "Halkapınar", "Hüyük", "Ilgın", "Kadınhanı", "Karapınar", "Karatay", "Kulu", "Meram", "Sarayönü", "Selçuklu", "Seydişehir", "Taşkent", "Tuzlukçu", "Yalıhüyük", "Yeniceoba", "Yunak"],
    "KÜTAHYA	  "	:["Altıntaş", "Aslanapa", "Çavdarhisar", "Domaniç", "Dumlupınar", "Emet", "Gediz", "Hisarcık", "Kütahya", "Pazarlar", "Şaphane", "Simav", "Tavşanlı"],
    "MALATYA	  "	:["Akçadağ", "Arapgir", "Arguvan", "Battalgazi", "Darende", "Doğanşehir", "Doğanyol", "Hekimhan", "Kale", "Kuluncak", "Malatya", "Pütürge", "Yazıhan", "Yeşilyurt"],
    "MANİSA		  "	:["Ahmetli", "Akhisar", "Alaşehir", "Demirci", "Gölmarmara", "Gördes", "Kırkağaç", "Köprübaşı", "Kula", "Manisa", "Salihli", "Sarıgöl", "Saruhanlı", "Selendi", "Soma", "Turgutlu"],
    "KAHRAMANMARAŞ"	:["Afşin", "Andırın", "Çağlayancerit", "Ekinözü", "Elbistan", "Göksun", "Kahramanmaraş", "Nurhak", "Pazarcık", "Türkoğlu"],
    "MARDİN       "	:["Dargeçit", "Derik", "Kızıltepe", "Mardin", "Mazıdağı", "Midyat", "Nusaybin", "Ömerli", "Savur", "Yeşilli"],
    "MUĞLA		  "	:["Bodrum", "Dalaman", "Datça", "Fethiye", "Kavaklıdere", "Köyceğiz", "Marmaris", "Milas", "Muğla", "Ortaca", "Ula", "Yatağan"],
    "MUŞ		  "	:["Bulanık", "Hasköy", "Korkut", "Malazgirt", "Muş", "Varto"],
    "NEVŞEHİR	  "	:["Acıgöl", "Avanos", "Derinkuyu", "Gülşehir", "Hacıbektaş", "Kozaklı", "Nevşehir", "Ürgüp"],
    "NİĞDE		  "	:["Altunhisar", "Bor", "Çamardı", "Çiftlik", "Niğde", "Ulukışla"],
    "ORDU		  "	:["Akkuş", "Aybastı", "Çamaş", "Çatalpınar", "Çaybaşı", "Fatsa", "Gölköy", "Gülyalı", "Gürgentepe", "İkizce", "Kabadüz", "Kabataş", "Korgan", "Kumru", "Mesudiye", "Ordu", "Perşembe", "Ulubey", "Ünye"],
    "RİZE		  "	:["Ardeşen", "Çamlıhemşin", "Çayeli", "Derepazarı", "Fındıklı", "Güneysu", "Hemşin", "İkizdere", "İyidere", "Kalkandere", "Pazar", "Rize"],
    "SAKARYA	  "	:["Adapazarı", "Akyazı", "Arifiye", "Erenler", "Ferizli", "Geyve", "Hendek", "Karapürçek", "Karasu", "Kaynarca", "Kocaali", "Pamukova", "Sapanca", "Serdivan", "Söğütlü", "Taraklı"],
    "SAMSUN		  "	:["Alaçam", "Asarcık", "Atakum", "Ayvacık", "Bafra", "Canik", "Çarşamba", "Havza", "İlkadım", "Kavak", "Ladik", "Ondokuzmayıs", "Salıpazarı", "Tekkeköy", "Terme", "Vezirköprü", "Yakakent"],
    "SİİRT		  "	:["Aydınlar", "Baykan", "Eruh", "Kurtalan", "Pervari", "Siirt", "Şirvan"],
    "SİNOP		  "	:["Ayancık", "Boyabat", "Dikmen", "Durağan", "Erfelek", "Gerze", "Saraydüzü", "Sinop", "Türkeli"],
    "SİVAS		  "	:["Akıncılar", "Altınyayla", "Divriği", "Doğanşar", "Gemerek", "Gölova", "Gürün", "Hafik", "İmranlı", "Kangal", "Koyulhisar", "Sivas", "Suşehri", "Şarkışla", "Ulaş", "Yıldızeli", "Zara"],
    "TEKİRDAĞ	  "	:["Çerkezköy", "Çorlu", "Hayrabolu", "Malkara", "Marmara Ereğlisi", "Muratlı", "Saray", "Şarköy", "Tekirdağ"],
    "TOKAT		  "	:["Almus", "Artova", "Başçiftlik", "Erbaa", "Niksar", "Pazar", "Reşadiye", "Sulusaray", "Tokat", "Turhal", "Yeşilyurt", "Zile"],
    "TRABZON	  "	:["Akçaabat", "Araklı", "Arsin", "Beşikdüzü", "Çarşıbaşı", "Çaykara", "Dernekpazarı", "Düzköy", "Hayrat", "Köprübaşı", "Maçka", "Of", "Sürmene", "Şalpazarı", "Tonya", "Trabzon", "Vakfıkebir", "Yomra"],
    "TUNCELİ	  "	:["Çemişgezek", "Hozat", "Mazgirt", "Nazimiye", "Ovacık", "Pertek", "Pülümür", "Tunceli"],
    "ŞANLIURFA	  "	:["Akçakale", "Birecik", "Bozova", "Ceylanpınar", "Halfeti", "Harran", "Hilvan", "Şanlıurfa", "Siverek", "Suruç", "Viranşehir"],
    "UŞAK		  "	:["Banaz", "Eşme", "Karahallı", "Sivaslı", "Ulubey", "Uşak"],
    "VAN		  "	:["Bahçesaray", "Başkale", "Çaldıran", "Çatak", "Edremit", "Erciş", "Gevaş", "Gürpınar", "Muradiye", "Özalp", "Saray", "Van"],
    "YOZGAT		  "	:["Akdağmadeni", "Aydıncık", "Boğazlıyan", "Çandır", "Çayıralan", "Çekerek", "Kadışehri", "Saraykent", "Sarıkaya", "Sorgun", "Şefaatli", "Yenifakılı", "Yerköy", "Yozgat"],
    "ZONGULDAK	  "	:["Alaplı", "Çaycuma", "Devrek", "Gökçebey", "Kilimli", "Karadeniz Ereğli", "Zonguldak"],
    "AKSARAY	  "	:["Ağaçören", "Aksaray", "Eskil", "Gülağaç", "Güzelyurt", "Ortaköy", "Sarıyahşi"],
    "BAYBURT	  "	:["Aydıntepe", "Bayburt", "Demirözü"],
    "KARAMAN	  "	:["Ayrancı", "Başyayla", "Ermenek", "Karaman", "Kazımkarabekir", "Sarıveliler"],
    "KIRIKKALE	  "	:["Bahşılı", "Balışeyh", "Çelebi", "Delice", "Karakeçili", "Keskin", "Kırıkkale", "Sulakyurt", "Yahşihan"],
    "BATMAN		  "	:["Batman", "Beşiri", "Gercüş", "Hasankeyf", "Kozluk", "Sason"],
    "ŞIRNAK		  "	:["Beytüşşebap", "Cizre", "Güçlükonak", "İdil", "Silopi", "Şırnak", "Uludere"],
    "BARTIN		  "	:["Amasra", "Bartın", "Kurucaşile", "Ulus"],
    "ARDAHAN	  "	:["Ardahan", "Çıldır", "Damal", "Göle", "Hanak", "Posof"],
    "IĞDIR		  "	:["Aralık", "Iğdır", "Karakoyunlu", "Tuzluca"],
    "YALOVA		  "	:["Altınova", "Armutlu", "Çınarcık", "Çiftlikköy", "Termal", "Yalova"],
    "KARABÜK	  "	:["Eflani", "Eskipazar", "Karabük", "Ovacık", "Safranbolu", "Yenice"],
    "KİLİS		  "	:["Elbeyli", "Kilis", "Musabeyli", "Polateli"],
    "OSMANİYE	  "	:["Bahçe", "Düziçi", "Hasanbeyli", "Kadirli", "Osmaniye", "Sumbas", "Toprakkale"],
    "DÜZCE		  " :["Akçakoca", "Cumayeri", "Çilimli", "Düzce", "Gölyaka", "Gümüşova", "Kaynaşlı", "Yığılca"],

};


function populateCitySelect(citySelectId, districtSelectId, selectedCityId, selectedDistrictId) {
    var citySelect = document.getElementById(citySelectId);
    var districtSelect = document.getElementById(districtSelectId);
    var selectedCityInput = document.getElementById(selectedCityId);
    var selectedDistrictInput = document.getElementById(selectedDistrictId);

    // İl seçeneklerini doldur
    Object.keys(locations).forEach(function (city) {
        var option = document.createElement("option");
        option.value = city;
        option.text = city.charAt(0).toUpperCase() + city.slice(1); // İlk harfi büyük yap
        citySelect.add(option);
    });

    // İl değiştiğinde ilçe seçeneklerini güncelle
    citySelect.addEventListener("change", function () {
        var selectedCity = this.value;
        var districts = locations[selectedCity] || [];

        // İlçe seçeneklerini güncelle
        districtSelect.innerHTML = "<option value='' disabled selected>İlçe Seçin</option>" +
            districts.map(function (district) {
                return "<option value='" + district + "'>" + district + "</option>";
            }).join("");

        districtSelect.disabled = false; // İl seçildiğinde ilçe seçeneği etkinleştirilir

        // Seçilen il ve ilçeyi değişkenlere ata
        selectedCityInput.value = selectedCity;
        selectedDistrictInput.value = ""; // İl değiştiğinde ilçe input'unu boşalt
    });
}

// Ayrı bir fonksiyon varış noktası için
function populateDestinationCitySelect(citySelectId, districtSelectId, selectedCityId, selectedDistrictId) {
    var citySelect = document.getElementById(citySelectId);
    var districtSelect = document.getElementById(districtSelectId);
    var selectedCityInput = document.getElementById(selectedCityId);
    var selectedDistrictInput = document.getElementById(selectedDistrictId);

    // İl seçeneklerini doldur
    Object.keys(locations).forEach(function (city) {
        var option = document.createElement("option");
        option.value = city;
        option.text = city.charAt(0).toUpperCase() + city.slice(1); // İlk harfi büyük yap
        citySelect.add(option);
    });

    // İl değiştiğinde ilçe seçeneklerini güncelle
    citySelect.addEventListener("change", function () {
        var selectedCity = this.value;
        var districts = locations[selectedCity] || [];

        // İlçe seçeneklerini güncelle
        districtSelect.innerHTML = "<option value='' disabled selected>İlçe Seçin</option>" +
            districts.map(function (district) {
                return "<option value='" + district + "'>" + district + "</option>";
            }).join("");

        districtSelect.disabled = false; // İl seçildiğinde ilçe seçeneği etkinleştirilir

        // Seçilen il ve ilçeyi değişkenlere ata
        selectedCityInput.value = selectedCity;
        selectedDistrictInput.value = ""; // İl değiştiğinde ilçe input'unu boşalt
    });
}

// İki farklı seçim kutusu oluşturmak için fonksiyonları çağır
populateCitySelect("departureCity", "departureDistrict", "selectedDepartureCity", "selectedDepartureDistrict");
populateDestinationCitySelect("destinationCity", "destinationDistrict", "selectedDestinationCity", "selectedDestinationDistrict");
