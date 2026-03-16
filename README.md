# 🚀 CookBook AI

> Discover. Cook. Share.

CookBook je mobilna aplikacija razvijena za Android koja spaja **kulinarsku zajednicu** i **umjetnu inteligenciju** kako bi korisnicima pomogla lakše otkrivati nove recepte i dijeliti vlastite.

Aplikacija omogućuje korisnicima da:

* objavljuju i dijele recepte
* prate druge autore i otkrivaju nove ideje
* ocjenjuju i lajkaju recepte
* koriste AI za generiranje ili strukturiranje recepata

Projekt je razvijen kao dio kolegija **Razvoj mobilnih aplikacija**.

---

# ✨ Glavne funkcionalnosti

## 👨‍🍳 Društvena platforma za recepte

* objava i uređivanje recepata
* korisnički profili
* lajkovi i ocjenjivanje recepata
* praćenje drugih korisnika (follow)
* feed s najnovijim receptima

## 🔎 Pretraga recepata

* pretraga po naslovu
* filtriranje po tagovima
* filtriranje po sastojcima
* prikaz najbolje ocijenjenih recepata

## 🤖 AI funkcionalnosti

Uz pomoć **Gemini AI** modela aplikacija omogućuje:

* **Import recepta iz teksta**
  korisnik zalijepi tekst recepta → aplikacija ga pretvara u strukturirani recept

* **Prijedlog recepata iz sastojaka**
  korisnik unese sastojke koje ima → AI predlaže moguće recepte

* **AI pomoć pri otkrivanju novih kulinarskih ideja**

---

# 🧱 Arhitektura aplikacije

Projekt prati modernu Android arhitekturu:

```
UI (Jetpack Compose)
        ↓
ViewModel
        ↓
Repository
        ↓
Data Sources
   ├── Firebase (backend & social features)
   ├── Gemini AI (AI features)
   └── Room Database (lokalni cache)
```
## Architecture Guidelines

- `Screen` prikazuje UI i ne sadrži poslovnu logiku.
- `ViewModel` drži stanje ekrana.
- Svi ViewModeli nasljeđuju `BaseViewModel`.
- Za učitavanje podataka koristi se `UiState`.
- `UseCase` sadrži poslovnu logiku.
- `Repository` dohvaća podatke.
- Dependency injection se radi pomoću Hilt-a.
---

# 🛠 Tehnologije

* Kotlin
* Jetpack Compose
* MVVM arhitektura
* Firebase Authentication
* Firebase Firestore
* Firebase Storage
* Gemini AI
* Room Database
* Coil (image loading)

---

# 🗂 Struktura projekta

```
com.cookbook
│
├── data
│   ├── local        # Room database
│   ├── remote       # Firebase / Gemini API
│   └── repository
│
├── domain
│   ├── model
│   └── usecase
│
├── ui
│   ├── screens
│   ├── components
│   └── navigation
│
└── util
```

---

# 📦 Plan razvoja

## MVP

* objava recepata
* pretraga recepata
* korisnički profili
* like i rating sustav
* follow korisnika
* AI import recepta iz teksta
* AI prijedlog recepata iz sastojaka

## Buduće funkcionalnosti

* komentari na recepte
* push notifikacije
* prepoznavanje sastojaka sa slike (AI Vision)
* personalizirani recipe feed
* shopping lista

---

# 👥 Autori

**Frane Krapić** i **Marko Podnar**

---

# ⭐ Podržite projekt

Ako vam se projekt sviđa:

* pratite razvoj projekta
* predložite nove funkcionalnosti
