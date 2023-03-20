<template>
  <div>
    <h1>This is the "Vos trajets" page</h1>
  </div>
  <v-container>
    <v-table>
      <thead>
        <tr>
          <th class="text-left">
            Départ
          </th>
          <th class="text-left">
            Arrivée
          </th>
          <th class="text-left">
            Date
          </th>
          <th class="text-left">
            Heure
          </th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="item in trajets" :key="trajets.id">
          <td>{{ item.depart }}</td>
          <td>{{ item.arrivee }}</td>
          <td>{{ item.date }}</td>
          <td>{{ item.heure }}</td>
        </tr>
      </tbody>
    </v-table>
  </v-container>
</template>
  
<style scoped></style>
  
<script setup>
import vosTrajetsComp from "../components/vosTrajetsComp.vue";
</script>