(ns offcourse.styles.components.index
  (:require [offcourse.styles.components
             [cards :refer [cards]]
             [button :refer [button]]
             [logo :refer [logo]]
             [label :refer [label-component]]
             [list :refer [list-component]]
             [sheet :refer [sheet]]
             [footer :refer [footer]]
             [header :refer [header]]]))

(defn components [config]
  (let [components [sheet button logo label-component list-component header cards footer]]
    (for [component components] (component config))))
