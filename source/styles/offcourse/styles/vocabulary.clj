;;;; Naming Schema ;;;;
;
; General:
; 1. Use flat specificity as much as possible (single class selectors) and limit cascade usage to component.
; 2. Use layout and grid styles to do all major positioning: Components are always full width.
; 3. Use Clojure templates and units to decouple markup and design pattern.
; 4. Use helpers to prevent the excessive creation of container classes, but generally avoid them.
;
; Naming rules:
; 1. The single dash is used to seperate words
; 2. The double dash is used to distinguish component elements
; 3. The data attributes are used to distinguish component variations and state 
;
; Todo:
; 1. Seperate component elements from component variations with data attribute (avoid double meaning of double dash)
; 2. Use Clojure templates more consistently 
;
; Question:
; 1. Does the use of component variations with the data attr, combined with Clojure templates, 
;    decrease the need to share properties through subclassing? 
;    Arguments:    
;    1. It makes the classname denote an abstraction which is almost equal to the tag attr.
;       Classnames will not tell everything about the component anymore, splitting meaning.  
;    2. It generates a lot of boilerplate by only using components to couple properties to markup.
;       Templates should be concerned with code that is shared across components, not across component variations.
;       It troubles the idea that all code concerning the component is in one place. 
;    3. Every component variation will become a component in its own right, which makes you wonder why that wasn't
;       declared in the first place. Without shared styles, through subclassing, the component class 
;       is rather meaningless. 
;   (4. It will also generate a lot of duplicate properties in the css file, 
;       even though that barely matters when measuring performance.) 
;
;       - global / layout / typography / helpers / shame 
;       - component and component variations
;       - templates 
;       - processed units / colors / fonts 
;       - raw colors / fonts / breakpoints
;
;    Decision: Keep component variations to provide default styling and to keep most meaning in one place. 
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
(s/defclass container--subgrid)
(s/defclass container--fw)
(s/defclass container--wrap)

; Helpers
(s/defclass padding-b-third)
(s/defclass padding-t-twothird)
(s/defclass padding-b-twothird)
(s/defclass padding-t-one)
(s/defclass padding-b-one)
(s/defclass padding-tb-one)
(s/defclass padding-t-two)
(s/defclass padding-b-two)
(s/defclass padding-tb-two)
(s/defclass padding-tb-four)

; Typography
(s/defclass title)
(s/defclass subtitle)
(s/defclass text)
(s/defclass content) ; Class with child selectors for markup that isn't classed 

; Components
(s/defclass header)
(s/defclass header--column)
(s/defclass header--row)

(s/defclass logo)
(s/defclass logo--padded)
(s/defclass logo--inverse)
(s/defclass logo--large)

(s/defclass form--row)
(s/defclass form--input)
(s/defclass form--subscribe)
(s/defclass form--success)
(s/defclass form--error)
(def and--form--error (s/& (form--error))) ; Flat specificity avoided because of mailchimp form classes

(s/defclass image)
(s/defclass image--filtered)
(s/defclass image--filtered-hover)

(s/defclass card)
(s/defclass card--section)
(s/defclass card--business)

(s/defclass footer)

(s/defclass button)
(def button-card (button (s/attr :data-button-type := :card)))

(s/defclass list)
(s/defclass list--item)

(s/defclass label)

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
