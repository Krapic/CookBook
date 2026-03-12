# 🍳 CookBook AI

> **Discover. Create. Share.**
> The next‑generation social cooking platform powered by AI.

CookBook AI je moderna **Android aplikacija** koja kombinira **društvenu mrežu za recepte** i **umjetnu inteligenciju** kako bi korisnicima pomogla otkrivati, stvarati i dijeliti kulinarske ideje na potpuno nov način.

Korisnici mogu objavljivati recepte, pratiti druge kuhare, ocjenjivati jela te uz pomoć **AI asistenta** pretvoriti bilo koji tekst ili skup sastojaka u inspiraciju za sljedeći obrok.

---

# 🚀 Ključne funkcionalnosti

## 👨‍🍳 Social cooking platform

* objava i dijeljenje recepata
* korisnički profili
* like sustav
* ocjenjivanje recepata (⭐ rating)
* praćenje drugih korisnika (follow)
* otkrivanje novih recepata kroz feed

## 🔍 Pametna pretraga

* pretraga po naslovu
* filtriranje po tagovima
* pretraga po sastojcima
* pronalazak najbolje ocijenjenih recepata

## 🤖 AI asistencija

Uz pomoć **Gemini AI modela** aplikacija omogućuje:

* **AI import recepta iz teksta**
  zalijepi tekst recepta → aplikacija ga strukturira

* **AI prijedlog recepata iz sastojaka**
  upiši sastojke koje imaš → AI predlaže recepte

* **AI pomoć pri otkrivanju novih kulinarskih ideja**

---

# 📱 Vizija proizvoda

CookBook AI želi postati **platforma koja spaja društvenu mrežu i umjetnu inteligenciju u svijetu kuhanja**.

Cilj je omogućiti korisnicima da:

* lakše otkrivaju nove recepte
* dijele vlastite kulinarske ideje
* prate zanimljive autore
* koriste AI kao kreativnog pomoćnika u kuhinji

---

# 🧱 Arhitektura aplikacije

Projekt koristi modernu Android arhitekturu:

```
UI (Jetpack Compose)
        ↓
ViewModel (state management)
        ↓
Repository layer
        ↓
Data sources
   ├── Firebase (backend & social features)
   ├── Gemini AI (AI features)
   └── Room (lokalna baza)
```

---

# 🛠 Tehnologije

* **Kotlin**
* **Jetpack Compose**
* **MVVM arhitektura**
* **Firebase Authentication**
* **Firebase Firestore**
* **Firebase Storage**
* **Gemini AI**
* **Room Database**
* **Coil (image loading)**

---

# 🗂 Struktura projekta

```
com.cookbook
│
├── data
│   ├── local        # Room baza
│   ├── remote       # Gemini / Firebase API
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

# 🖼 Demo (coming soon)

```
Ovdje će kasnije ići screenshotovi aplikacije
ili GIF demo rada aplikacije
```

---

# 👥 Autori

**Frane Krapić** i 
**Marko Podnar**

Projekt je razvijen kao dio kolegija **Razvoj mobilnih aplikacija**.

---

# ⭐ Podržite projekt

Ako vam se projekt sviđa:

* pratite razvoj projekta
* predložite ideje za nove funkcionalnosti
