(ns offcourse.styles.components.roadmap-item
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* / + -]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

(defn roadmap-item [{:keys [templates breakpoints colors units]}]
  [[v/roadmap-item                  (merge (:column-component        templates)
                                           (:sheet                   templates)
                                           {:padding                (:full units)})
    [v/hovered                             (:border-highlighted      templates)
     [v/roadmap-item--collapsable          {:max-height             (* (:full units) 10)
                                            :transition            [[:max-height "0.5s" :ease-in-out "0.5s"]]}]]]
   [v/roadmap-item--collapsable     (merge {:padding               [[0 0 0 0]]
                                            :overflow                :hidden
                                            :transition            [[:max-height "0.5s" :ease-in-out]]
                                            :max-height              0})]

   [v/roadmap-item--header          (merge (:row-component           templates)
                                           {:justify-content         :space-between
                                            :padding               [[0 0 (:full units) 0]]})]
   [v/roadmap-item--issue-number    (merge (:title                   templates)
                                           {:text-align              :right})]
   [v/roadmap-item--meta            (merge (:recycled-paper          templates)
                                           (:border-quotes           templates)
                                           (:row-component           templates)
                                           {:padding              [[(:full units) (:five units) (:full units) (- (:full units) (:sixth units))]]
                                            :justify-content         :flex-start})]
   [v/roadmap-item--assignee-title  (merge {:padding               [[0 0 0 (:two units)]]})]
   [v/roadmap-item--assignee        (merge (:column-component        templates)       
                                           {:padding               [[0 (:three units) 0 0]]})]
   [v/roadmap-item--row-container   (merge (:row-component           templates)       
                                           {})]
   [v/roadmap-item--profile-img     (merge {:padding              [[(:sixth units) (:third units) (:sixth units) 0 ]]
                                            :width                  (:two units)
                                            :height                 (:two units)})]
   [v/roadmap-item--milestone       (merge (:column-component        templates)  
                                           {})]
   [v/roadmap-item--activity        (merge (:column-component        templates)
                                           {:padding               [[0 (:three units) 0 0]]})]
   [v/roadmap-item--body            (merge (:row-component           templates)      
                                           {:padding              [[(:full units) 0 0 0]]})]
   [v/roadmap-item--title           (merge (:title                   templates))]
   [v/roadmap-item--smalltitle      (merge (:smalltitle              templates))]
   [v/roadmap-item--text            (merge (:text                    templates))]
   [v/roadmap-item--tiny            (merge (:label                   templates))]
  ])