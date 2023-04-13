package blackjack

internal class Deck(
    private val deckFilePath: String = "/BasicDeck.txt"
) {
    //Denne gjør om tekstfila resources/BasicDeck.txt til en liste av strings. I.e ["C2", "C3", "C4", ..]
    //Den må ikke brukes, og den kan endres som ønskelig, den er bare for å få dere i gang
    private fun generateDeckFromFile() =
        Deck::class.java.getResource(deckFilePath)?.readText()?.split(",")?.map { it.trim() }
            ?: throw IllegalArgumentException("Deck file path $deckFilePath does not contain a file")
}