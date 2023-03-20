<template>
    <div>
        <h1>This is the "Proposer un Trajet - Nombre de Places et Reservation Directe" page</h1>
    </div>
    <v-container>
        <h1> Combien de sièges? </h1>
        <br>
        <v-form fast-fail @submit.prevent>
            <v-text-field v-model="numberValue" hide-details single-linetype="number"> 3 </v-text-field>
        </v-form>
    </v-container>
    <v-container fluid>
        <h1> Reservation directe? </h1>
        <br>
        <v-radio-group v-model="inline" inline>
            <v-radio label="Oui" value="radio-1"></v-radio>
            <v-radio label="Non" value="radio-2"></v-radio>
        </v-radio-group>
    </v-container>
    <v-container>
    <v-btn type="submit" block class="mt-2" value="lien vers proposerTrajetRetour" onclick="self.location.href='./proposerTrajetRetour'">Suivant</v-btn> 
  </v-container>
</template>
    
<style scoped></style>
    
<script setup>
import proposerTrajetNbPlaceResDirComp from "../components/proposerTrajetNbPlaceResDirComp.vue";
import proposerTrajetRetour from "./proposerTrajetRetourView.vue";
</script>