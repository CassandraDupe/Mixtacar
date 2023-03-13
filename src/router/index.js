import { createRouter, createWebHistory } from "vue-router";
import personnes_sur_le_trottoir from "../views/personnesSurLeTrottoirView.vue";
import vos_trajets from "../views/vosTrajetsLieuxDepArView.vue";
import messages from "../views/messagesView.vue";
import profil from "../views/profilView.vue";

// === définition des routes de l'application
// --- principalement les items du menu
// --- mais aussi des navigations internes comme 'master/detail'

// !!! important : la navigation doit se faire entre des "views" qui ne gèrent que l'affichage
// !!!  le code fonctionnel doit être uniquement dans les 'components'
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: () => import('../views/homeView.vue')
    },
    {
      path: "/vos_trajets",
      name: "vos trajets",
      component: () => import('../views/vosTrajetsLieuxDepArView.vue')
    },
    {
      path: "/messages",
      name: "messages",
      component: () => import('../views/messagesView.vue')
    },
    {
      path: "/profil",
      name: "profil",
      component: () => import('../views/profilView.vue')
    },
    {
      path: "/personnes_sur_le_trottoir",
      name: "personnes sur le trottoir",
      component: () => import('../views/personnesSurLeTrottoirView.vue')
    },
    {
      path: "/deconnexion",
      name: "deconnexion",
      component: () => import('../views/deconnexionView.vue')
    }
  ]
});

export default router;
