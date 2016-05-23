(ns offcourse.styles.shame
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :as u :refer [percent px]]
             [stylesheet :refer [at-media]]
             [arithmetic :refer [/ + *]]
             [selectors :as s]]))

; Shame file, but somehow interesting to seperate changes from the base code
(defn shame [{:keys [templates breakpoints colors units fonts]}]
  [[:#mc_embed_signup_scroll (merge (:column-component templates)
                                    {:align-items :flex-start})]
   [:.mc-field-group (merge (:row-component templates))
                            {:width (percent 100)
                             :padding [[(:half units) 0]]}]
   [:#mce-EMAIL-LABEL (merge (:title templates)
                             {:padding [[(:half units) 0]]})]
   [:#mce-EMAIL-LABEL-TWO (merge (:subtitle templates)
                                 {})]
   [:#mce-EMAIL (merge (:subtitle templates))
                       {:width "100%"
                        :padding [[(:half units)]]
                        :background (:light colors)}]
   [:#mc-embedded-subscribe (merge (:textbar templates)
                                   {:font-size   (* (:atom units) 42) 
                                    :line-height (* (:atom units) 60) })]
   [:#mc_embed_signup [:div.mce_inline_error (merge (:subtitle templates)
                                                    {:color (str (:night colors) " !important")
                                                     :background (str (:primary colors) " !important")})]]
   [:#mce-submit {:padding [[0 0 0 (:full units)]]}]
   [:#mce-success-response (merge (:subtitle templates)
                                  {:padding-bottom (:half units)})]
   [:.feature--image {:width "100%"
                      :filter "grayscale(100%)"}]
   [:.example--image {:width "100%"
                      :filter "grayscale(100%)"}]
   ;responsiveness 
   (let [{:keys [min-width max-width percent]} (first breakpoints)]
     (at-media {:min-width min-width :max-width max-width}
               [:.main {:flex-direction :column}]
               [:.dashboard {:width "100%"}]
               [:.sheets {:padding (:full units)}]
               [:.layout {:height "unset"}]))])