/**
 * 転生抑止先１グリッド定義
 */

let Tb5TenseiYokushiSaki1GridColumns = [];

$(function() {
    Tb5TenseiYokushiSaki1GridColumns = [
        Column.comma('TENSEI_YOKUSHI_SAKI1_ID', Messages['Tb5TenseiYokushiSaki1Grid.tenseiYokushiSaki1Id'], 80, 'primaryKey numbering', null),
        Column.comma('TENSEI_YOKUSHI_ID', Messages['Tb5TenseiYokushiSaki1Grid.tenseiYokushiId'], 80, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiYokushiSaki1Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5TenseiYokushiSaki1Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5TenseiYokushiSaki1Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
