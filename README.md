🛒 Mini Grocery Delivery App (Blinkit Style)
A simple grocery delivery Android app built with Kotlin and XML layouts, inspired by Blinkit.
Users can browse products, add to cart, and place orders.

📱 Screens
ScreenDescriptionLoginEnter mobile number with +91 prefix and send OTPOTP VerificationEnter 4-digit OTP (Fake OTP: 1234) to verifyHomeBrowse all products, search, add to cartCartView added items, change quantity, see bill summaryCheckoutEnter delivery address, choose payment method (COD / Online)Order SuccessView Order ID, estimated delivery time, success message

✨ Features

Mobile number input with validation
OTP verification with countdown timer (Fake OTP: 1234)
Product listing with image, name, price
Search / filter products in real time
Add to cart with toast confirmation
Increase / Decrease quantity in cart
Bill summary (Item Total + Delivery Fee + To Pay)
Delivery address display
Payment method selection (COD / Online Payment)
Auto-generated Order ID on success
Estimated delivery time on Order Success screen


🛠 Tech Stack
TechnologyUsageKotlinPrimary languageXML LayoutsAll UI screensMVVM ArchitectureSeparation of UI and business logicViewModelHolds and manages UI-related dataLiveDataObserves data changes and updates UIRecyclerViewProduct list and Cart listViewBindingSafe view access without findViewById

📂 Project Structure
com.yourname.groceryapp/
│
├── data/
│   ├── model/
│   │   ├── Product.kt
│   │   └── CartItem.kt
│   └── repository/
│       ├── ProductRepository.kt
│       └── CartRepository.kt
│
├── ui/
│   ├── login/
│   │   ├── LoginActivity.kt
│   │   └── LoginViewModel.kt
│   ├── home/
│   │   ├── HomeActivity.kt
│   │   ├── HomeViewModel.kt
│   │   └── ProductAdapter.kt
│   ├── cart/
│   │   ├── CartActivity.kt
│   │   ├── CartViewModel.kt
│   │   └── CartAdapter.kt
│   ├── checkout/
│   │   ├── CheckoutActivity.kt
│   │   └── CheckoutViewModel.kt
│   └── ordersuccess/
│       └── OrderSuccessActivity.kt
│
└── utils/
    └── Constants.kt

🚀 How to Run
1. Clone the repository
   https://github.com/dibya-dhal/-Mini-Grocery-Delivery-App-Blinkit-Style-/edit/main/README.md

2.Open in Android Studio
3.Let Gradle sync complete
4.Run on emulator or physical device (Android 7.0+ / API 24+)
5.On Login screen — enter any 10-digit mobile number
6.On OTP screen — enter 1234 to proceed

📦 APK
Download the latest APK from the Releases section.

🎥 Screen Recording
Click here to watch the demo
   

Clone the repository
