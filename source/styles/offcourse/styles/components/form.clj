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

                                  :background          (:light colors)}]

                                  :font-family         (:base fonts)
                                  :font-size           (:title-font units) 
                                  :line-height         (:title-line-height units)
                                  :font-weight          300
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


  ])

  ;  [:#mc_embed_signup {:width (percent 100)}]
   ; [:#mc_embed_signup_scroll (merge (:column-component templates)
   ;                                  {:width (percent 100)
   ;                                   :align-items :flex-start})]
   ; [:.mc-field-group (merge (:row-component templates)
   ;                          {:width (percent 100)
   ;                           :flex-wrap :wrap})]
   ; [:#mce-EMAIL-LABEL (merge (:title templates)
   ;                           {:padding [[0 0 (:full units) 0]]})]
   ; [:#mce-EMAIL-LABEL-TWO (merge (:text templates)
   ;                               {:width (percent 100)
   ;                                :padding-top (:full units)})]
   ; [:#mce-EMAIL (merge (:subtitle templates))
   ;                     {:flex 2
   ;                      :padding [[(:half units)(:half units)(:half units)(:full units)]]
   ;                      :font-family (:base fonts)
   ;                      :font-size  (:title-font units) 
   ;                      :line-height (:title-line-height units)
   ;                      :font-weight 300
   ;                      :background (:light colors)}]
   ; [:#mce-submit (merge (:row-component templates)
   ;                  {:flex 1
   ;                   :align-items :stretch})]

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