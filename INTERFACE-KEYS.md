# Conventional keys for payment interfaces

Conventional values for payment interfaces (i.e. APIs). Typically PSP names plus a postfix if they provide multiple independent APIs. 

THIS IS NOT A LIST OF PARTNERS, PREFERRED PROVIDERS OR SOME OTHER RECOMMENDATION OR BUSINESS STATEMENT. It just serves to "reserve names" for companies that are or could be integrated privately or publicly in the future. 

To be used in:
* commercetools payment object "paymentMethodInfo.paymentInterface" property 

Formal convention:
* Please prefix white-labeled / branded but identical APIs with the name of the white label offering and separate with a dash. E.g. PAY_ON-ARVATO. This makes it easier to map the transaction request to an interface implementation. 
* \[A-Z,_,0-9\]\*, minus-hyphen reserved for branded variants of the same interface. 
* Try to avoid shortcuts.
* Keep the list sorted alphabetically


## Special Values

| Key | Name |
|---|---|
| INTERNAL | catch-all for payments done by the merchant manually. Alternatively a custom value can be used that is not in the list below. |
| EXAMPLE | reserved for examples in documentation |
| TEMPLATE | reserved for the specification templates |


## Providers & Gateways

| Key | Name | Website |
|---|---|---|
| ADYEN |  |  |
| AUTHORIZE_NET |  |  |
| PAYMILL |  |  |
| PAYONE |  |  |
| PAYPAL | PayPal (TODO research and separate the various APIs they provide ) | http://www.paypal.com |
| SOFORT | TODO is Klarna a separate API? |  |
| STRIPE |  |  |
| WIRECARD |  | http://www.wirecard.com/ |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
