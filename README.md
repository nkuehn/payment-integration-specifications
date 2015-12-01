# Commercetools Payment Integration Specifications  

This is a documentation and specification only project that contains information and commercetools API JSON templates 
to develop and  use a payment (PSP / Payment Gateway) integration with the [commercetools platform](http://dev.commercetools.com)

## Payment Method and PSP (Interface) Naming

The commercetools [Payment Object](http://dev.commercetools.com/http-api-projects-payments.html) has two String properties
for the name of the payment API the payment should be triggered and the payment method to be used.  They are part of 
the [PaymentMethodInfo](http://dev.commercetools.com/http-api-projects-payments.html#paymentMethodInfo) structure. 

To allow safe operation of multiple PSPs in one projects, PSP Intefaces have to use collision-free values in the 
`paymentInterface` property.  These are maintained here in this file:

[Interface-Keys.md](Interface-Keys.md) 

Please create an Issue if a company is missing or has separate APIs that need separate names. 

## Payment Object Types per Method

The commercetools payment Objects are extended with payment method specific [custom fields](http://dev.commercetools.com/http-api-projects-custom-fields.html)
These custom fields are defined in [types](http://dev.commercetools.com/http-api-projects-types.html)

To allow many projects to implement the checkout and their proceses in a uniform manner, the information model (i.e. type) 
of a specific payment method should be uniform across payment APIs that are integrated "behind" the commercetools
platform.  All payment API / PSP specific data are maintained in the `interfaceInteractions` of the payment object, 
which are completely PSP specific and also defined via types. 

The following specifications apply:

* [Method-Keys.md](Method-Keys.md) defines conventional identifiers for payment methods which are to be set in the `method`
  field of the [PaymentMethodInfo](http://dev.commercetools.com/http-api-projects-payments.html#paymentMethodInfo)
* [YAML and JSON files in the `types/*` folder](types/) contains the definition of payment object types per payment method. 
  YAML is used for the master spec because ist supports comments. The naming convention is to start with `payment-` and then 
  append the Method Key. 

We are aware that the method is implicitly defined via the custom type set on the specific payment resource, so the 
`method` String field is normally a duplicate.  But the platform should remain open to completely different implementation
patterns and it may happen that certain situation need payment API specific payment types although this is not the intended
implementation style. 

## Checkout Protocol

All PSP integration services should at least support the System Interaction Protocol defined in 

[Protocol.md](Protocol.md)

It defines the standard interaction flow between Frontend Implementation, commercetools platform, the payment integration
service and the PSP (Server) API. 

## Integration Service API

Every Payment Integration Service must provide at least a minimum API that is defined here:

[Payment-Integration-Api.swagger.yml](Payment-Integration-Api.swagger.yml) 

The File is in the [swagger API specification format](http://swagger.io/specification/). The JSON variant is automatically
generated and overwritten from the YAML file.  Swagger allows Client implementation to easily generate API Clients for a 
large number of programming languages and runtime platforms. 

## TODO
 * add node SDK based tests against live API that create and delete all types (validation). 
 * Let them run on travis.
 * Link to swagger editor with URL of the File here. 
 