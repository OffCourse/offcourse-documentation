(ns offcourse.styles.components.list
  (:refer-clojure :exclude [first last list])
  (:require [offcourse.styles.vocabulary :as v]))

(defn list-component [{:keys [templates colors fonts units]}]
  [[v/list              (merge (:column-component     templates))]
   [v/list--item               (:list-item            templates)
    [v/hovered                 (:selected             templates)]
    [v/selected                (:highlighted          templates)]]])

