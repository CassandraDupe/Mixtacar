<template>
    <div>
      <h1>This is the "Proposer trajet retour" page</h1>
    </div>
    <v-container fluid>
        <h1> Souhaitez vous publier le trajet retour maintenant? </h1>
        <br>
        <v-radio-group v-model="inline" inline>
            <v-radio label="Oui" value="radio-1"></v-radio>
            <v-radio label="Non" value="radio-2"></v-radio>
        </v-radio-group>
    </v-container>
    <v-container>
    <!-- si la réponse est oui il faut renvoyer à l'écran date et heure, sinon renvoi au menu -->
    <v-btn type="submit" block class="mt-2" value="lien vers le menu" onclick="self.location.href='./'">Suivant</v-btn>
    <!-- bon faut vérifier que ça a été créé quand même et puis faut le mettre sur l'écran du menu quand on vient de cette page -->
    <v-alert closable text="Votre trajet a bien été créé" type="success"></v-alert>
  </v-container>
  </template>
  
  <style scoped>
  </style>
  
  <script setup>
  import proposerTrajetRetourComp from "../components/proposerTrajetRetourComp.vue";
  </script>