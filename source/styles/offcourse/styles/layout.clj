(ns offcourse.styles.layout
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [stylesheet :refer [at-media]]
              [units :as u :refer [percent vh px]]]
            [offcourse.styles.vocabulary :as v]))

(defn layout [{:keys [templates units colors breakpoints]}]
  [[v/layout                  (merge (:column-component       templates)
                                     (:paper                  templates))]
   [v/layout--section         (merge (:recycled-paper         templates)
                                     (:row-component          templates)
                                     {:justify-content        :center})]

   [v/grid                    (merge (:row-component          templates)
                                     {:width                 (:max-content-width units)})]
   [v/grid--section           (merge (:column-component       templates)
                                     {:flex                   1
                                      :padding             [[(:full units)]]})
    [v/last                   (merge {:flex                   3
                                      :padding               (:full units)})]]

   [v/subgrid                 (merge {:display                :block
                                      :column-span            :none
                                      :column-gap            (:full units)})]
   [v/subgrid-two                    {:columns                2}]
   [v/subgrid-three                  {:columns                3}]

   [v/container                      (:row-component          templates)]
   [v/container-column               (:column-component       templates)]
   [v/container-fw            (merge (:column-component       templates)
                                     {:align-items            :stretch})]
   [v/container-wrap                 (:flex-wrap              :wrap)]
   [v/container-subgrid              {:display                :inline-block
                                      :width                 (percent 100)}]

   (let [{:keys [min-width max-width]} (first breakpoints)]
    (at-media                        {:min-width min-width    :max-width max-width}
     [[v/grid                        (:column-component       templates)]
      [v/grid--section               {:flex                   :unset}
       [v/last                       {:flex                   :unset}]]
      [v/subgrid-two                 {:columns                1}]
      [v/subgrid-three               {:columns                1}]
      ]))])