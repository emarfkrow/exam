/**
 * 転生元グリッド定義
 */

let Tb5TenseimotoGridColumns = [];

$(function() {
    Tb5TenseimotoGridColumns = [
        Column.comma('TENSEIMOTO_ID', Messages['Tb5TenseimotoGrid.tenseimotoId'], 80, 'primaryKey numbering', null),
        Column.text('TENSEIMOTO_INFO', Messages['Tb5TenseimotoGrid.tenseimotoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseimotoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5TenseimotoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5TenseimotoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
