# List of conventional payment method keys

To be used in the following places:
 * commercetools payment object "paymentMethodInfo.method" property. 

The commercetools platform does not restrict you to these values, but it is advisable to use them to ease support and the development of reusable integrations. 

Please submit a pull request to add or improve a payment method that does not have a conventional key. 

Specialized Variations of Methods are "flattened", but there are conventions for the high-level method defined here,too (e.g. CREDITCARD, CREDITCARD-MASTERCARD, CREDITCARD-MASTERCARD-3D). 

Uppercase latin letters, the underscore and decimal numbers are allowed \[A-Z,_,0-9\]\*, the dash is reserved for specialization / variants. 

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
| CASH_ADVANCE |  | Cash received in advance before goods are shipped |
| CASH_ON_DELIVERY |  | Delivery Service collects the Money from the buyer. The "PSP" can be directly the delivery service or a wrapper API |
| INVOICE |  | Goods are paid after delivery based on an invoice. Can be done internally by the merchant |
| INVOICE-PAYOLUTION |  |  |
| INVOICE-RATEPAY |  |  |
| INVOICE-KLARNA |  |  |
| CHECK-ADVANCE |  | Money to be received by merchant in advance via Check / Money Order |
| DIRECT_DEBIT |  |  |
| DIRECT_DEBIT-ELV |  |  |
| DIRECT_DEBIT-SEPA |  |  |
| INSTALLMENT |  |  |
| INSTALLMENT-PAYOLUTION |  |  |
| INSTALLMENT-RATEPAY |  |  |
| CREDIT_CARD | Credit Card |  |
| CREDIT_CARD-MASTERCARD |  |  |
| CREDIT_CARD-MASTERCARD-SECURECODE |  |  |
| CREDIT_CARD-VISA |  |  |
| CREDIT_CARD-VISA-VERIFIED_BY_VISA |  |  |
| CREDIT_CARD-AMERICAN_EXPRESS |  |  |
| CREDIT_CARD-AMERICAN_EXPRESS-SAFE_KEY |  |  |
| CREDIT_CARD-DINERS_CLUB |  |  |
| CREDIT_CARD-DISCOVER |  |  |
| CREDIT_CARD-JCB |  |  |
| DEBIT_CARD |  | (probably never directly used)  |
| DEBIT_CARD-MAESTRO |  |  |
| DEBIT_CARD-CARTE_BLEUE |  |  |
| CREDIT |  | (never directly used) |
| WALLET-PAYPAL | PayPal | The PayPal Wallet |
| WALLET-PAYPAL | PayPal | The PayPal Wallet |
| BANK_TRANSFER |  | (probably not used directly) |
| BANK_TRANSFER-ADVANCE |  | Money received by merchant before delivery via Bank Transfer |
| BANK_TRANSFER |  |  |
| BANK_TRANSFER-GIROPAY |  | A direct debit style system backed by some german banks |
| BANK_TRANSFER-SOFORTUEBERWEISUNG |  | pay via you online banking system |
| BANK_TRANSFER-IDEAL |  |  |
| BANK_TRANSFER-POSTFINANCE |  |  |
| MONETA | moneta.ru |  |
| SKRILL_WALLET | Skrill Digital Wallet |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |




