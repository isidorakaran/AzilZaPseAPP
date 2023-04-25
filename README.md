# AzilZaPseAPP

Zadatak završnog rada bio je napraviti aplikaciju koja omogućava čitanje i unos podataka, te promjenu i brisanje postojećih. Tema Azil za pse odabrana je zbog izrazite želje za otvaranjem azila u Vukovaru i zbog velike ljubavi prema životinjama. 
Cilj aplikacije jeste olakšati rad u azilu koji  neprestano prima nove pse i održava najbolji omjer udomljenih pasa. U radu  će biti opisan svaki dio aplikacije uz opis što svaki prozor u aplikaciji znači , što predstavlja te koje mogućnosti daje. Podatke u aplikaciji može čitati, unositi, mjenjati i brisati isključivo jedan operater, odnosno zaposlenik u azilu koji pomoću autorizacije pristupa aplikaciji. Pomoću nje operater ima mogućnost i čitanja podataka u Excel-u gdje jednim klikom prenosi podatke iz aplikacije i sprema ih u Excel dokument radi lakšeg pregleda.
Tijekom rada na aplikaciji najveći izazov bio je shvaćanje povezivanja aplikacije s bazom podataka. Najviše vremena izdvojenog na izradu aplikacije iskoristila sam na dizajn i detalje. Najzanimljiviji dio izrade bio je rad na kontrolama. Pomoću kontrola operateru sam ograničila nepotrebne unose brojeva, znakova ili slova, kao i izradu kontrole koja je formatirala e-mail i broj telefona. U nastavku završnog rada slijedi slika ER-dijagrama i detaljan opis aplikacije. 

1.	Prozor SplashScreen

SplashScreen sadrži dva istovremena procesa. Prvi proces je GIF slika,a drugi proces je progress bar kojemu se pomoću petlje ispiše tekst na lijevoj strani i postotak učitavanja na desnoj. SplashScreen služi kao proces koji traje do učitavanja aplikacije, naime kako bi GIF bio prikazan do kraja stavljeno je  ograničenje učitavanja na  7 sekundi.

2.	Prozor Login

Login služi za autorizaciju operatera. Unešene su kontrole za e-mail i lozinku koje omogućavaju obavezan unos i govore ako je kombinacija neispravna. Aplikacija omogućuje registraciju samo za jednog operatera odnosno zaposlenika u azilu. Klikom na gumb autoriziraj ulazi se u sljedeći prozor.

3.	Prozor Izbornik

U ovom dijelu aplikacije može se vidjeti galerija sa slikama pasa iz azila kao i riječ GIT na koju ukoliko operater klikne može doći do GIT profila . Galerija je rađena tako što je napravljen paket u kojemu se nalaze slike i poslana putanja od tog paketa, a izlistanje slika rađeno je postavljanjem određenih uvjeta. Iznad galerije postoji Menu Bar koji klikom na riječ „Programi“ daje mogućnost ulaska u druge prozore poput psa, osobe, razmjene i vrste razmjene koji imaju određene podatke za manipuliranje. Pored riječi „Programi“ postoji i „Aplikacija“ gdje klikom na „O nama“ možete vidjeti poruku koja ispisuje informacije o azilu i aplikaciji.  Pored riječi „Aplikacija“ je „Izlaz“ gdje klikom na riječ izlazite iz kompletnog programa.

4.	Prozor Psi

Prozor psi je najkompleksiniji jer je povezan s razmjenom preko tabela pas_transakcija što znači da tabela pas ima listu raumjena. Prvobitno je omogućeno dodavanje, promjena i brisanje psa iz baze i svim poljima koja su neophodna za popuniti dodane su kontrole. Ime sadrži sljedeće kontrole: minimalnu i maksimalnu dužinu imena, obavezan unos imena, onemogućavanje unosa broja i znakova. Pol ima kontrolu za onemogućavanje brojeva i znakova kao i obavezan format koji je postavljen da pol psa mora biti M ili Ž. Dob psa ima iste kontrole kao i ime. Pas ne može imati manje od 1 kg i više od 100 kg. Na samom vrhu stoji lista pasa koja ispisuje sve pse u aplikaciji. Klikom na nekog od psa u listi pored možemo vidjeti informacije o izabranom psu poput npr. opisa stanja u kom je pas došao i datuma kada je došao u azil. Ispod informacija postoji još jedna lista koja omogućava pretragu svih razmjena u azilu pomoću tražilice koja pretražuje po datumu ili opisu. Iznad liste svih razmjena su dvije tipke. Tipka sa strelicom prema gore zadaje traženu razmjenu izabranom psu, dok tipka sa strelicom prema dolje briše razmjenu ukoliko operater greškom spoji određenu razmjenu na pogrešnog psa. S ovim prozorom spajam psa s njegovom odgovarajućom razmjenom.

5.	Prozor osobe

Omogućavanje dodavanja, promjene i brisanja osoba. Kontrole urađene za ime i prezime ne dozvoljavaju unos brojeva i znakova uz obavezan unos. E-mail i broj telefona također imaju kontrolu za validaciju, drugim riječima nije dozvoljen unos koji ne odgovara postavljenom formatu. Sa lijeve strane postoji lista osoba i klikom na određenu osobu omogućavamo brisanje. Ukoliko osoba posjeduje neke razmjene koje su zavedene u aplikaciji, brisanje osobe neće biti moguće. Moguće je obrisati samo osobe koje nemaju nikakvu razmjenu, a ima li osoba razmjene ili ne vidimo u listi ispod. Dolje desno postoji gumb Export u Excel koji sve podatke o osobama (ime, prezime, e-mail, broj telefona) prebacuje u Excel dokument radi lakšeg pregleda.

6.	Prozor Razmjene

S desne strane postoji lista svih razmjena u kojima su prikazani samo opis i datum. Kao u prethodnim prozorima klikom na neku od razmjena omogućujemo njenu promjenu ili brisanje kao i dodavanje nove razmjene. Napravljene su kontrole slične kao i za osobu. Za odabir osobe koja je zadužena za tu razmjenu i vrste razmjene kojoj pripada napravljen je padajući izbornik pomoću kojeg klikom biramo željenu osobu i vrstu razmjene. Odabir vrste razmjene se stavlja na odgovarajuću razmjenu, a vrsta razmjene može biti: unutar azila, van azila, pas je otišao kod veterinara...

7.	Prozor Vrsta razmjene

Ovaj prozor pomoću atributa predznak omogućava prepoznavanje psa koji je unutar azila i psa koji je van azila. U polju vrsta razmjene operater upisuje novu vrstu ukoliko ona ne postoji, a s padajućim izbornikom stavlja mu predznak minus ili plus koji su nazvani Trenutno u azilu i Van azila. Pomoću tog padajućeg izbornika imamo mogućnost realne slike azila ukoliko pas treba ići kod veterinara ili na šišanje.



