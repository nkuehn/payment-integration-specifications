# Data Mapping between TEMPLATE and the commercetools platform

## Relevant reference documentation links:
 * XXX please fill links, especially to developer documentation. Also provide information where to get eventually 
 necessary access codes to the information

## Payment methods covered by this specification
See also: [Method keys convention](https://github.com/nkuehn/payment-integration-specifications/blob/master/Method-Keys.md)
 
| CTP conventional key | Name / key at TEMPLATE |
|---|---|
| CREDIT_CARD | CCard |


# API Data mapping

## commercetools payment object (semantically defined base properties)

* [CT Payment documentation](http://dev.sphere.io/http-api-projects-payments.html#payment)

| CT payment JSON path | TEMPLATE Server API | Who is master? |  Value transform | 
|---|---|---|---|
| id |  |  |  |
| version |  |  |  |
| customer |  |  |  |
| externalId |  |  |  |
| interfaceId |  |  |  |
| amountPlanned |  |  |  |
| amountAuthorized |  |  |  |
| authorizedUntil |  |  |  |
| amountPaid |  |  |  |
| amountRefunded |  |  |  |
| paymentMethodInfo.paymentInterface |  |  |  |
| paymentMethodInfo.method |  |  |  |
| paymentMethodInfo.name.{locale} |  |  |  |
| paymentStatus.interfaceCode |  |  |  |
| paymentStatus.interfaceText |  |  |  |
| paymentStatus.state |  |  |  |
| transactions\[\*\].id |  |  |  |
| transactions\[\*\].timestamp |  |  |  |
| transactions\[\*\].type |  | TODO type mapping table |  |
| transactions\[\*\].amount |  |  |  |
| transactions\[\*\].interactionId |  |  |  |
| transactions\[\*\].state |  |  | TODO state mapping |

See below for the custom fields. 


## commercetools Cart and Order object (mapping to payment interface on payment creation)

* [CT Order documentation](http://dev.sphere.io/http-api-projects-orders.html#order)
* [CT Cart documentation](http://dev.sphere.io/http-api-projects-carts.html#cart)

| CT Cart or Order JSON path | TEMPLATE Server API | TEMPLATE Client / redirect API | Value transform |
|---|---|---|---|
| id |  |  |  |
| createdAt |  |  |  |
| lastModifiedAt |  |  |  |
| customerId |  |  |  |
| customerEmail |  |  |  |
| country |  |  |  |
| totalPrice.currencyCode |  |  |  |
| totalPrice.centAmount |  |  |  |
| taxedPrice.totalNet.currencyCode |  |  |  |
| taxedPrice.totalNet.centAmount |  |  |  |
| taxedPrice.totalGross.currencyCode |  |  |  |
| taxedPrice.totalGross.centAmount |  |  |  |
| taxedPrice.taxPortions\[\*\].rate |  |  |  |
| taxedPrice.taxPortions\[\*\].amount.currencyCode |  |  |  |
| taxedPrice.taxPortions\[\*\].amount.centAmount |  |  |  |
| cartState | Active/Merged/Ordered |  |  |
| lineItems\[\*\].id |  |  |  |
| lineItems\[\*\].name.{locale} |  |  |  |
| lineItems\[\*\].quantity |  |  |  |
| lineItems\[\*\].variant.id |  |  |  |
| lineItems\[\*\].variant.sku |  |  |  |
| lineItems\[\*\].price.value.currencyCode |  |  |  |
| lineItems\[\*\].price.value.centAmount |  |  |  |
| lineItems\[\*\].price.discountedPrice.value.currencyCode |  |  |  |
| lineItems\[\*\].price.discountedPrice.value.centAmount |  |  |  |
| lineItems\[\*\].taxRate.name |  |  |  |
| lineItems\[\*\].taxRate.amount |  |  |  |
| lineItems\[\*\].taxRate.includedInPrice |  |  |  |
| customLineItems\[\*\].id |  |  |  |
| customLineItems\[\*\].name.{locale} |  |  |  |
| customLineItems\[\*\].quantity |  |  |  |
| customLineItems\[\*\].money.currencyCode |  |  |  |
| customLineItems\[\*\].money.centAmount |  |  |  |
| customLineItems\[\*\].discountedPrice.value.currencyCode |  |  |  |
| customLineItems\[\*\].discountedPrice.value.centAmount |  |  |  |
| customLineItems\[\*\].taxRate.name |  |  |  |
| customLineItems\[\*\].taxRate.amount |  |  |  |
| customLineItems\[\*\].taxRate.includedInPrice |  |  |  |
| shippingAddress.title |  |  |  |
| shippingAddress.salutation |  |  |  |
| shippingAddress.firstName |  |  |  |
| shippingAddress.lastName |  |  |  |
| shippingAddress.streetName |  |  |  |
| shippingAddress.streetNumber |  |  |  |
| shippingAddress.additionalStreetInfo |  |  |  |
| shippingAddress.postalCode |  |  |  |
| shippingAddress.city |  |  |  |
| shippingAddress.region |  |  |  |
| shippingAddress.state |  |  |  |
| shippingAddress.country |  |  |  |
| shippingAddress.company |  |  |  |
| shippingAddress.department |  |  |  |
| shippingAddress.building |  |  |  |
| shippingAddress.apartment |  |  |  |
| shippingAddress.pOBox |  |  |  |
| shippingAddress.phone |  |  |  |
| shippingAddress.mobile |  |  |  |
| shippingAddress.email |  |  |  |
| billingAddress.* |  | (analogous to shippingAddress) |  |
| shippingInfo.shippingMethodName |  |  |  |
| shippingInfo.price.currencyCode |  |  |  |
| shippingInfo.price.centAmount |  |  |  |
| shippingInfo.taxRate.centAmount |  |  |  |
| shippingInfo.discountedPrice.price.currencyCode |  |  |  |
| shippingInfo.discountedPrice.price.centAmount |  |  |  |

FYI: Not all Cart / Order Fields are mentioned here because some are not relevant for the case or have no defined semantics (custom filds / product attributes). 


## Payment Method specific fields of the payment object

XXX this is just a sample. Please take the commercetools custom payment types (per method) from the [method type specifications](../../methods/) in the payment specifications project. 

### CREDIT_CARD

#### commercetools payment object transaction types

| CT transaction type | TEMPLATE equivalent | Notes |
|---|---|---|
| Authorization |  |  |
| CancelAuthorization |  |  |
| Charge |  |  |
| Refund |  |  |
| Chargeback |  |  |

#### commercetools payment object transaction states

| CT transaction state | TEMPLATE equivalent | Notes |
|---|---|---|
| Pending |  |  |
| Success |  |  |
| Failure |  |  |

#### commercetools payment object custom fields

`custom.fields.` has to be prefixed when actually accessing these fields.  

| CT Payment custom property | TEMPLATE Server API | Who is Master? | Value transform |
|---|---|---|---|
| foo |  |  |  |
| foo |  |  |  |

### DIRECTDEBIT_SEPA

XXXX ... analogous to the Credit Card sample above ... 

# Constraint Rules to be implemented by the Integration

XXX list constraints that have to be followed by and integration to create valid requests to the payment API in 
"if .. and ... then ... must (not) ...".  E.g. 

* XXX EXAMPLE "if payment method INSTALLMENT-KLARNA is used, billing address and 
delivery address must be identical".

