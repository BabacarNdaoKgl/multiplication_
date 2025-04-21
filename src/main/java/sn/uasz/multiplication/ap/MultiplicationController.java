package sn.uasz.multiplication.ap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Préfixe optionnel pour les endpoints
public class MultiplicationController {

    /**
     * Endpoint pour multiplier deux nombres.
     * Exemple d'appel : GET /api/multiply?num1=5&num2=10
     *
     * @param num1 Le premier nombre (paramètre de requête)
     * @param num2 Le deuxième nombre (paramètre de requête)
     * @return Le résultat de la multiplication
     */
    @GetMapping("/multiply")
    public double multiplyNumbers(
            @RequestParam(value = "num1", defaultValue = "0") double num1,
            @RequestParam(value = "num2", defaultValue = "0") double num2) {

        // Logique métier très simple
        double result = num1 * num2;

        // Spring Boot convertira automatiquement le double en réponse (JSON ou texte brut)
        return result;
    }

    /**
     * Un endpoint simple pour vérifier que l'application est en cours d'exécution.
     * Exemple d'appel : GET /api/ping
     *
     * @return Une chaîne de caractères "pong"
     */
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
