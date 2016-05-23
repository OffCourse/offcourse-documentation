(ns offcourse.styles.shame
  (:refer-clojure :exclude [+ - * /])
  (:require [offcourse.styles.vocabulary :as v]
            [garden
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
                       {:flex 2
                        :padding [[(:half units)]]
                        :background (:light colors)}]

   [:#mce-submit (merge (:row-component templates)
                        {:justify-content :center
                                      :background (:night colors)
                                      :flex 1
                                      :padding [[0 0 0 0]]})]
   [:#mc-embedded-subscribe (merge (:textbar templates)
                                   {:flex 0
                                    :font-size   (* (:atom units) 42) 
                                    :line-height (* (:atom units) 60) })]

   [:#mc_embed_signup [:div.mce_inline_error (merge (:subtitle templates)
                                                    {:color (str (:night colors) " !important")
                                                     :background (str (:primary colors) " !important")})]]

   [:#mce-success-response (merge (:subtitle templates)
                                  {:padding-bottom (:half units)})]
   [:.feature--image {:width "100%"
                      :filter "grayscale(100%)"}]
   [:.example--image {:width "100%"
                      :filter "grayscale(100%)"}]
   (at-media {:min-width (px 768)} 
             [:.sticky {:position :sticky
                        :padding [[(:full units) 0 (:full units) 0]]
                        :top (:full units)}])
   ;responsiveness 
   (let [{:keys [min-width max-width percent]} (first breakpoints)]
     (at-media {:min-width min-width :max-width max-width}
               [v/header--textbar (merge {:font-size (/ (:header-font units) 2)
                                          :line-height (/ (:header-line-height units) 2)})]
               [v/header--textbar-small (merge {:display :none})]
               [v/header--section (merge {:flex 0})]
               [:.main {:flex-direction :column}]
               [:.dashboard {:width "100%"}]
               [:.sheets {:padding (:full units)}]
               [:.layout {:height "unset"}]))])


