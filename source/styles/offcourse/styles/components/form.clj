(ns offcourse.styles.components.form
  (:refer-clojure :exclude [rem + - * /])
  (:require [garden.arithmetic :refer [* /]]
            [garden.units :as u :refer [percent px rem]]
            [offcourse.styles.vocabulary :as v]))

(defn form [{:keys [templates borders colors fonts units]}]
  [[v/form--row       (merge     (:row-component        templates)
                                 {:flex-wrap            :wrap})]

   [v/form--input     (merge     (:subtitle             templates))
                                 {:flex                 2
                                  :padding           [[(:half units)(:half units)(:half units)(:full units)]]

                                  :background          (:light colors)

                                  :font-family         (:base fonts)
                                  :font-size           (:title-font units) 
                                  :line-height         (:title-line-height units)
                                  :font-weight          300}]

   [v/form--subscribe (merge     (:textbar              templates)
                                 {:flex 1
                                  :justify-content      :center
                                  :align-items          :center
                                  :padding           [[(:half units) 0]]
                                  
                                  :background          (:primary colors)

                                  :font-family         (:base fonts)
                                  :font-weight          300
                                  :font-size           (:title-font units) 
                                  :line-height         (:title-line-height units)

                                  :cursor               :pointer})
    [v/hovered                   {:background          (:night colors)}]]

   [v/form--error     (merge     (:subtitle             templates)
                                 {:width               (percent 100)
                                  :padding-left        (:full units)
                                  :margin               0
                                  :color               (:day colors)
                                  :background          (:night colors)})]
   [v/form--success   (merge     (:title                templates)
                                 {:color               (:day colors)
                                  :background          (:night colors)})]
  ]) 

   ; [:#mc_embed_signup [:div.mce_inline_error (merge (:subtitle templates)
   ;                                                  {:width (percent 100)
   ;                                                   :padding-left (str (float (:magnitude (:full units))) (name (:unit (:full units))) " !important")
   ;                                                   :margin "0 !important"
   ;                                                   :color (str (:day colors) " !important")
   ;                                                   :background (str (:night colors) " !important")})]]

   ; [:#mce-success-response (merge (:title templates)
   ;                                {:padding-top (:full units)})]
   ; [:#mce-responses {:width (percent 100)}]
   ; [:#mce-error-response (merge (:subtitle templates)
   ;                              {:width (percent 100)
   ;                               :padding (:third units)
   ;                               :padding-left (str (float (:magnitude (:full units))) (name (:unit (:full units))) " !important")
   ;                               :margin "0 !important"
   ;                               :color (str (:day colors) " !important")
   ;                               :background (str (:night colors) " !important")})]