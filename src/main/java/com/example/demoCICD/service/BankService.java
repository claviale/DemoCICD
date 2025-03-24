package com.example.demoCICD.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankService {

    /**
     * Code RG-5151 (n° fonctionnalité/ticket)
     * @param amount le montant à prélever
     * @return
     */
    public ServiceResponseDTO<Float> debit(float amount) {
        // 2300€ dans le compte
        // Guard Close : erreur avant le fonctionnement par défault

        // Cas erreur 789
        if (amount > 2300) {
            return ServiceResponseDTO.buildResponse("789", "Solde insuffisant");
        }

        // Cas succès 207
        return ServiceResponseDTO.buildResponseWithData("207", "Prélèvement effectué avec succès", 2300-amount);

    }
}
