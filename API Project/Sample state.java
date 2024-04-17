@State("A request to create a user")
public void sampleState() {}
@TestTemplate
@ExtendWith(PactVerificationInvocationContextProvider.class)
void pactTestTemplate(PactVerificationContext context) {
     // Verify the interaction between Consumer and Provider
     // using the contract generated in target/pacts
     context.verifyInteraction();
}
