# List of conventional payment method keys

To be used in the following places:
 * commercetools payment object "paymentMethodInfo.method" property. 

The commercetools platform does not restrict you to these values, but it is advisable to use them to ease support and 
the development of reusable integrations. 

Please submit a pull request to add or improve a payment method that does not have a conventional key. 

Specialized Variations of Methods are "flattened", but there are conventions for the high-level method defined here,too 
(e.g. `basic-card`, `basic-card-mastercard`).  The `basic-card` structures and constants are using W3C standard. 

Uppercase latin letters, the underscore and decimal numbers are allowed \[A-Z,_,0-9\]\*, the dash is reserved for 
specialization / variants. 

## Special values 
| Key | Description |
|---|---|
| `undefined` | Special code for cases where the selection of the method is done externally. Should only be set temporarily as an alternative to not setting a value.  |
| `merchant-credit` | No actual money flows, the amount is deducted from a credit that the buyer already had with the merchant. Not an installment that has to be paid later) |
| `voucher` | A possibly different person than the merchant has pre-paid money at  the merchant which is then used to pay for an order. Not a discount code, rather a gift voucher!  |
| `free` | pseudo-payment for orders that have a zero total sum for some other the other reason.  |

## Payment Methods

| Key | Name | Description, external references |
|---|---|---|
| `cash` |  | Used e.g. for POS purchases |
| `cash-advance` |  | Cash received in advance before goods are shipped (this is actual Cash, please see BANK_TRANSFER-ADVANCE below for the typical case) |
| `cash-on-delivery` |  | Delivery Service collects the Money from the buyer. The "PSP" can be directly the delivery service or a wrapper API |
| `invoice` |  | Goods are paid _after_ delivery based on an invoice. Can be done internally by the merchant or via a third party. Use this value if the specific way is encapsulated in the PSP or integration |
| `invoice-direct` |  | Direct Invoice by the Merchant |
| `invoice-klarna` |  |  |
| `check-advance` |  | Money to be received by merchant in advance via Check / Money Order |
| `direct-debit` |  |  |
| `direct-debit-sepa` |  | European Direct Debit System. Formerly called ELV in Germany |
| `installment` |  | Can be realized by the merchant or via a 3rd party. Use this value if the selection of method is encapsulated by the PSP |
| `installment-direct` |  | Direct Credit Contract with the Merchant |
| `installment-billpay` |  |  |
| `installment-klarna` |  |  |
| `basic-card` | Credit / Debit / Prepaid Card | Generic Key for any type of Credit Card (recommended, implementation will autodetect specific variant) |
| `wallet-paypal` | PayPal | The PayPal Wallet |
| `wallet-skrill` | Skrill Digital Wallet |  |
| `wallet-moneta` | moneta.ru |  |
| `banktransfer` |  | (probably not used directly) |
| `banktransfer-advance` |  | Money received by merchant before delivery via Bank Transfer |
| `banktransfer-eps` |  | Austrian eps system www.stuzza.at  |
| `banktransfer-giropay` |  | A direct debit style system backed by some german banks |
| `banktransfer-sofortueberweisung` |  | pay via you online banking system using sofort.com's services |
| `banktransfer-idea` |  | Netherlands specific IDeAl system |
| `banktransfer-postfinance-efinance` |  | Switzerland specific |
| `banktransfer-postfinance-card` |  | Switzerland specific |


