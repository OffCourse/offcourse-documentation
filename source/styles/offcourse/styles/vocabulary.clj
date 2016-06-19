;;;; Naming Schema ;;;;
;
; General:
; 1. Use flat specificity as much as possible (single class) and limit cascade usage to component
; 2. Use layout and grid styles to do all major positioning: Components are always full width 
; 3. Helpers are to be avoided, but are used to avoid the excessive creation of container classes
; 4. Use Clojure templates and units to decouple markup and design pattern
;
; Naming rules:
; 1. The single dash is used to seperate words
; 2. The double dash is used to distinguish component elements
; 3. Data attributes are used to distinguish component variations and modifiers
;
; Questions:
; 1. Component variation and elements work through the cascade right now, but use the same naming convention
;    as elements. This might be confusing. Using the data attribute however resorts to higher specifity instead,
;    which I don't like either.
; 2. Helper usage. Named containers might be semantic in some manner, but they are also difficult to place. 
;    Especially with demanding designers in mind, padding helpers seemed like a better solution.    
;
;;;;;;;;;;;;;;;;;;;;;;;


(ns offcourse.styles.vocabulary
  (:refer-clojure :exclude [first second last list])
  (:require [garden.selectors :as s]))

; Layout
(s/defclass layout)
(s/defclass layout--section)

(s/defclass grid)
(s/defclass grid--section)

(s/defclass subgrid)
(s/defclass subgrid--two)
(s/defclass subgrid--three)

(s/defclass container)
(s/defclass container--fw)

; Helpers
(s/defclass padding-b-third)
(s/defclass padding-t-twothird)
(s/defclass padding-b-twothird)
(s/defclass padding-t-one)
(s/defclass padding-b-one)
(s/defclass padding-tb-one)
(s/defclass padding-t-two)
(s/defclass padding-b-two)
(s/defclass padding-tb-four)

; Typography
(s/defclass title)
(s/defclass subtitle)
(s/defclass text)
(s/defclass content) ; Class with child selectors for markup that isn't classed 

; Header
(s/defclass header)
(s/defclass header--column)
(s/defclass header--row)

; Logo
(s/defclass logo)
(s/defclass logo--padded)
(s/defclass logo--inverse)
(s/defclass logo--large)

; Form
(s/defclass form--row)
(s/defclass form--input)
(s/defclass form--subscribe)
(s/defclass form--success)
(s/defclass form--error)
(def and--form--error (s/& (form--error))) ; Flat specificity avoided because of mailchimp form classes

; Images
(s/defclass image)
(s/defclass image--filtered)
(s/defclass image--filtered-hover)

; Card
(s/defclass card)
(s/defclass card--section)
(s/defclass card--business)




; Footer
(s/defclass footer)
(s/defclass footer--container)
(s/defclass footer--header)
(s/defclass footer--textbar)

; Components
(s/defclass list)
(def todo-list (list (s/attr :data-list-type := :todo)))
(def edit-list (list (s/attr :data-list-type := :edit)))
(s/defclass list--item)


(s/defclass button-container)

(s/defclass labels)
(s/defclass label)

(s/defclass button)
(def textbar-button   (button (s/attr :data-button-type := :textbar)))
(def icon-button      (button (s/attr :data-button-type := :icon)))
(def checkbox-button  (button (s/attr :data-button-type := :checkbox)))

;; MODIFIERS
(s/defpseudoclass hover)
(s/defpseudoclass disabled)
(s/defpseudoclass first-child)
(s/defpseudoclass last-child)

(def selected (s/& (s/attr :data-selected := :true)))
(def disabled (s/& disabled))
(def hovered (s/& hover))
(def first (s/& first-child))
(def second (s/& (s/nth-child 2)))
(def third (s/& (s/nth-child 3)))
(def last (s/& last-child))
