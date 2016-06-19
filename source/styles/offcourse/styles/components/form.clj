(ns offcourse.styles.components.form
  (:refer-clojure :exclude [rem + - * /])
  (:require [garden.arithmetic :refer [* /]]
            [garden.units :as u :refer [percent px rem]]
            [offcourse.styles.vocabulary :as v]))

(defn form [{:keys [templates colors fonts units]}]
  [[v/form--row           (merge (:row-component        templates)
                                 {:flex-wrap            :wrap})]

   [v/form--input         (merge (:subtitle             templates))
                                 {:flex                 2
                                  :padding           [[(:half units)(:half units)(:half units)(:full units)]]

                                  :background          (:light colors)

                                  :font-family         (:base fonts)
                                  :font-size           (:title-font units) 
                                  :line-height         (:title-line-height units)
                                  :font-weight          300}]

   [v/form--subscribe     (merge (:textbar              templates)
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

   ; Flat specificity avoided because of mailchimp form classes
   [:div 
    [v/and--form--error   (merge (:subtitle             templates)
                                 {:width               (percent 100)
                                  :padding           [[(:third units) (:third units) (:third units) (:full units)]]
                                  :margin               0
                                  :color               (:day colors)
                                  :background          (:night colors)})]]
   [v/form--success       (merge (:title                templates)
                                 {:padding-top         (:two-third units)})]
  ]) 