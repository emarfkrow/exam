/**
 * 職位マスタグリッド定義
 */

let MhrShokuiGridColumns = [];

$(function() {
    MhrShokuiGridColumns = [
        Column.comma('SHOKUI_ID', Messages['MhrShokuiGrid.shokuiId'], 80, 'primaryKey numbering', null),
        Column.text('SHOKUI_MEI', Messages['MhrShokuiGrid.shokuiMei'], 300, 'notblank', null),
        Column.comma('SHOKUI_ON', Messages['MhrShokuiGrid.shokuiOn'], 80, 'notblank', null),
        Column.date('TEKIYO_BI', Messages['MhrShokuiGrid.tekiyoBi'], 80, '', Slick.Formatters.Extends.Date),
        Column.date('SHURYO_BI', Messages['MhrShokuiGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
        Column.cell('UPDATE_TS', Messages['MhrShokuiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['MhrShokuiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['MhrShokuiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
