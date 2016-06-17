(ns offcourse.styles.components.index
  (:require [offcourse.styles.components
             [cards :refer [cards]]
             [button :refer [button]]
             [logo :refer [logo]]
             [form :refer [form]]
             [label :refer [label-component]]
             [list :refer [list-component]]
             [sheet :refer [sheet]]
             [content :refer [content]]
             [footer :refer [footer]]
             [header :refer [header]]]))

(defn components [config]
  (let [components [sheet content button logo form label-component list-component header cards footer]]
    (for [component components] (component config))))
