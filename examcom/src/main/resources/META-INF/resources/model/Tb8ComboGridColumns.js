/**
 * 複合グリッド定義
 */

let Tb8ComboGridColumns = [];

$(function() {
    Tb8ComboGridColumns = [
        Column.refer('REFER_ID', Messages['Tb8ComboGrid.referId'], 90, 'primaryKey', 'REFER_MEI'),
        Column.refer('STINT_ID', Messages['Tb8ComboGrid.stintId'], 90, 'primaryKey', 'STINT_MEI'),
        Column.date('TEKIYO_BI', Messages['Tb8ComboGrid.tekiyoBi'], 90, 'primaryKey', Slick.Formatters.Extends.Date),
        Column.text('COMBO_INFO', Messages['Tb8ComboGrid.comboInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb8ComboGrid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
