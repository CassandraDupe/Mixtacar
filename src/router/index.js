import { createRouter, createWebHistory } from "vue-router";
import Personnes_sur_le_trottoir from "../views/Personnes_sur_le_trottoir.vue";
import Vos_trajets from "../views/Vos_trajets.vue";
import Messages from "../views/Messages.vue";
import Profil from "../views/Profil.vue";

// === définition des routes de l'application
// --- principalement les items du menu
// --- mais aussi des navigations internes comme 'master/detail'

// !!! important : la navigation doit se faire entre des "views" qui ne gèrent que l'affichage
// !!!  le code fonctionnel doit être uniquement dans les 'components'
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/vos_trajets",
      name: "Vos trajets",
      component: Vos_trajets
    },
    {
      path: "/messages",
      name: "Messages",
      component: Messages
    },
    {
      path: "/profil",
      name: "Profil",
      component: Profil
    },
    {
      path: "/Personnes_sur_le_trottoir",
      name: "Personnes sur le trottoir",
      component: Personnes_sur_le_trottoir
    }
  ]
});

export default router;
