# Commercetools Payment Integration Specifications  

This is a (for now) non-code project that contains all information and commerectools API JSON templates to develop and use a payment (PSP / Payment Gateway) integration in commercetools platform projects. 

Relevant Files:
* [METHOD-KEYS.md](METHOD-KEYS.md) collects conventional identifiers for payment methods. 
* ["methods/*" folders](methods/) contains commercetools platform JSON samples for custom payment object types per payment method. 
* [INTERFACE-KEYS.md](INTERFACE-KEYS.md) collects conventional identifiers for payment interfaces to avoid naming collisions in projects that implement more than one payment interface. 
* ["interfaces/*" folders](interfaces/) contains specifications for the actual INTERFACES, each consisting of commercetools platform JSON samples for the API interaction types and a README.md that contains the actual documentation. 

# TODO
* add travis tests against live API that create and delete all types (validation)