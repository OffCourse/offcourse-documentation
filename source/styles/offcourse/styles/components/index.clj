(ns offcourse.styles.components.index
  (:require [offcourse.styles.components
             [cards :refer [cards]]
             [block :refer [block]]
             [button :refer [button]]
             [logo :refer [logo]]
             [image :refer [image]]
             [form :refer [form]]
             [label :refer [label-component]]
             [list :refer [list-component]]
             [sheet :refer [sheet]]
             [content :refer [content]]
             [footer :refer [footer]]
             [header :refer [header]]]))

(defn components [config]
  (let [components [block sheet content button logo image form label-component list-component header cards footer]]
    (for [component components] (component config))))
