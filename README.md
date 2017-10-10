# Commercetools Custom Payment Types 

This repository contains 
 * custom field models for the  [commercetools platform](http://dev.commercetools.com) Payments API.
 * an exemplary naming scheme for payment methods

They can be used when building PSP integrations since you need to define custom field models anyway to save the Payment Method specific data in the commercetools payment API. 

## Payment Method Naming

The commercetools [Payment Object](http://dev.commercetools.com/http-api-projects-payments.html) has two String properties
for the name of the payment API the payment should be triggered and the payment method to be used.  They are part of 
the [PaymentMethodInfo](http://dev.commercetools.com/http-api-projects-payments.html#paymentMethodInfo) structure. 

To allow safe operation of multiple PSPs in one project, PSP Intefaces have to use collision-free values in the 
`paymentInterface` property.  These are not maintained here any more.  Using the company or API name turned out to be sufficient. 

## Payment Object Types per Method

The commercetools payment Objects are extended with payment method specific [custom fields](http://dev.commercetools.com/http-api-projects-custom-fields.html)
These custom fields are defined in [types](http://dev.commercetools.com/http-api-projects-types.html)

To allow many projects to implement the checkout and their proceses in a uniform manner, the information model (i.e. type) 
of a specific payment method should be uniform across payment APIs that are integrated "behind" the commercetools
platform.  All payment API / PSP specific data are maintained in the `interfaceInteractions` of the payment object, 
which are completely PSP specific and also defined via types. 

The following specifications apply:

* [Method-Keys.md](Method-Keys.md) defines exemplary identifiers for payment methods which are to be set in the `method`
  field of the [PaymentMethodInfo](http://dev.commercetools.com/http-api-projects-payments.html#paymentMethodInfo)
* [YAML and JSON files in the `types/*` folder](types/) contains a definition of payment object types per payment method. 
  YAML is used for the master spec because ist supports comments. The naming convention is to start with `payment-` and then 
  append the Method Key. 

