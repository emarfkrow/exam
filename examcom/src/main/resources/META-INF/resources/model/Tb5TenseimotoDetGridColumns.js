/**
 * 転生元明細グリッド定義
 */

let Tb5TenseimotoDetGridColumns = [];

$(function() {
    Tb5TenseimotoDetGridColumns = [
        Column.comma('TENSEIMOTO_ID', Messages['Tb5TenseimotoDetGrid.tenseimotoId'], 80, 'primaryKey numbering', null),
        Column.comma('TENSEIMOTO_BN', Messages['Tb5TenseimotoDetGrid.tenseimotoBn'], 80, 'primaryKey numbering', null),
        Column.text('TENSEIMOTO_DET_INFO', Messages['Tb5TenseimotoDetGrid.tenseimotoDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseimotoDetGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5TenseimotoDetGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5TenseimotoDetGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
