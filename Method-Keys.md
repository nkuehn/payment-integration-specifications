# List of conventional payment method keys

To be used in the following places:
 * commercetools payment object "paymentMethodInfo.method" property. 

The commercetools platform does not restrict you to these values, but it is advisable to use them to ease support and 
the development of reusable integrations. 

Please submit a pull request to add or improve a payment method that does not have a conventional key. 

Specialized Variations of Methods are "flattened", but there are conventions for the high-level method defined here,too 
(e.g. CREDITCARD, CREDITCARD-MASTERCARD, CREDITCARD-MASTERCARD-3D). 

Uppercase latin letters, the underscore and decimal numbers are allowed \[A-Z,_,0-9\]\*, the dash is reserved for 
specialization / variants. 

## Special values 
| Key | Description |
|---|---|
| UNDEFINED | Special code for cases where the selection of the method is done externally. Should only be set temporarily as an alternative to not setting a value.  |
| MERCHANT_CREDIT | No actual money flows, the amount is deducted from a credit that the buyer already had with the merchant. Not an installment that has to be paid later) |
| VOUCHER | A possibly different person than the merchant has pre-paid money at  the merchant which is then used to pay for an order. Not a discount code, rather a gift voucher!  |
| FREE | pseudo-payment for orders that have a zero total sum for some other the other reason.  |

## Payment Methods

| Key | Name | Description, external references |
|---|---|---|
| CASH |  | Used e.g. for POS purchases |
| CASH_ADVANCE |  | Cash received in advance before goods are shipped (this is actual Cash, please see BANK_TRANSFER-ADVANCE below for the typical case) |
| CASH_ON_DELIVERY |  | Delivery Service collects the Money from the buyer. The "PSP" can be directly the delivery service or a wrapper API |
| INVOICE |  | Goods are paid _after_ delivery based on an invoice. Can be done internally by the merchant or via a third party. Use this value if the specific way is encapsulated in the PSP or integration |
| INVOICE-DIRECT |  | Direct Invoice by the Merchant |
| INVOICE-KLARNA |  |  |
| CHECK-ADVANCE |  | Money to be received by merchant in advance via Check / Money Order |
| DIRECT_DEBIT |  |  |
| DIRECT_DEBIT-SEPA |  | European Direct Debit System. Formerly called ELV in Germany |
| INSTALLMENT |  | Can be realized by the merchant or via a 3rd party. Use this value if the selection of method is encapsulated by the PSP |
| INSTALLMENT-DIRECT |  | Direct Credit Contract with the Merchant |
| INSTALLMENT-BILLSAFE |  |  |
| INSTALLMENT-KLARNA |  |  |
| CREDIT_CARD | Credit Card | Generic Key for any type of Credit Card (recommended, implementation will autodetect specific variant) |
| DEBIT_CARD |  | (probably never directly used)  |
| DEBIT_CARD-MAESTRO |  |  |
| DEBIT_CARD-CARTE_BLEUE |  |  |
| CREDIT |  | (never directly used) |
| WALLET-PAYPAL | PayPal | The PayPal Wallet |
| WALLET-SKRILL | Skrill Digital Wallet |  |
| WALLET-MONETA | moneta.ru |  |
| BANK_TRANSFER |  | (probably not used directly) |
| BANK_TRANSFER-ADVANCE |  | Money received by merchant before delivery via Bank Transfer |
| BANK_TRANSFER-EPS |  | Austrian eps system www.stuzza.at  |
| BANK_TRANSFER-GIROPAY |  | A direct debit style system backed by some german banks |
| BANK_TRANSFER-SOFORTUEBERWEISUNG |  | pay via you online banking system |
| BANK_TRANSFER-IDEAL |  | Netherlands specific |
| BANK_TRANSFER-POSTFINANCE_EFINANCE |  | Switzerland specific |
| BANK_TRANSFER-POSTFINANCE_CARD |  | Switzerland specific |
|  |  |  |


## Optional Credit Card Network specific methods:

Normally the selection of credit card network is just done in the checkout UI and after that implicit in the card data placeholder / the real card number on the PSP side respectively.  
The 3secure preference is usually done through the respecive boolean field on the `payment-CREDIT_CARD` payment type. 
 
As there may be edge cases where the actual method key needs to deviate (e.g. for routing to different PSPs per Network) the following conventional keys can be used:

| Key | Name | Description, external references |
|---|---|---|
| CREDIT_CARD--3DSECURE | (two dashes!) Credit Card with explicit whish for 3Dsecure check | Will autodetect the card network, but force 3Dsecure check redirect |
| CREDIT_CARD-MASTERCARD |  | In case explicit restriction to MasterCard is intended |
| CREDIT_CARD-MASTERCARD-SECURECODE |  | 3Dsecure of MasterCard |
| CREDIT_CARD-VISA |  |  |
| CREDIT_CARD-VISA-VERIFIED_BY_VISA |  | 3Dsecure of VISA |
| CREDIT_CARD-AMERICAN_EXPRESS |  |  |
| CREDIT_CARD-AMERICAN_EXPRESS-SAFE_KEY |  | 3Dsecure of Amex |
| CREDIT_CARD-DINERS_CLUB |  |  |
| CREDIT_CARD-DISCOVER |  |  |
| CREDIT_CARD-JCB |  |  |




