(ns offcourse.styles.shame
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :as u :refer [percent px]]
             [stylesheet :refer [at-media]]
             [arithmetic :refer [/ + *]]
             [selectors :as s]]))

; Shame file to style the mailchimp form and images
(defn shame [{:keys [templates breakpoints colors units fonts]}]
  [[:#mce-EMAIL-LABEL (merge (:title templates))]
   [:#mce-EMAIL-LABEL-TWO (merge (:subtitle templates)
                                 {:padding-top (:half units)})]
   [:#mce-EMAIL (merge (:subtitle templates))
                       {:width "100%"
                        :margin [[(:half units) 0 (:half units) 0]]
                        :padding [[(:half units)]]
                        :background (:medium colors)}]
   [:#mc_embed_signup [:div.mce_inline_error (merge (:subtitle templates)
                                                    {:color (:night colors)
                                                     :background (:primary colors)})]]
   [:#mce-success-response (merge (:subtitle templates)
                                  {:padding-bottom (:half units)})]
   [:.team--image :.feature--image {:width "100%"
                                   :filter "grayscale(100%)"}]
   (let [{:keys [min-width max-width percent]} (first breakpoints)]
     (at-media {:min-width min-width :max-width max-width}
               [:.main {:flex-direction :column}]
               [:.dashboard {:width "100%"}]
               [:.sheets {:padding (:full units)}]))])